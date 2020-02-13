
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class LetterCounter {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // ask user to enter a string
        System.out.println("Enter your favorite city");
        String city = keyboard.nextLine();
        
        // ask user to enter a character
        System.out.println("Enter a letter");
        String characterEntered = keyboard.nextLine();
        
        // set a counter variable to 0
        int counter = 0;
        
        // loop through each character of the string
        
        for (int i=0; i<city.length(); i++) {
        
        // if the user's character matches this string character
            if (characterEntered.equalsIgnoreCase(String.valueOf(city.charAt(i)))) {
                // then add 1 to the counter

                counter++;
            }
        
        }
            
        // print the counter
        System.out.println("This character occurred " + counter + " times");
        
    }
    
}
