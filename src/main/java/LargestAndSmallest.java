
import java.util.Scanner;

public class LargestAndSmallest {

    public static void main(String[] args) {
        // ask the user to enter a series of numbers
        // and say when they're done enter -99
        System.out.println("Enter a series of numbers. When done, enter -99");


        // make an integer variable for the most recent number entered
        Scanner keyboard = new Scanner(System.in);

        int numberEntered = keyboard.nextInt();
        
        int largest = 0;
        int smallest = 0;
        
        // if they don't put in -99
        if (numberEntered != -99) {
            // make an integer variable for largest
            largest = numberEntered;

            // make an integer variable for smallest
            smallest = numberEntered;
        }
        
        // while the user has not entered -99
        while (numberEntered != -99) {
             // compare the most recent number to the largest
            // if it's bigger than the largest, set it to the largest variable
            if (numberEntered > largest) {
                largest = numberEntered;
            }

            // compare the most recen tnumber to the smallest
            // if its less than the smallest, set it to the smallest
            if (numberEntered < smallest) {
                smallest = numberEntered;
            }
            
            // get the next number from the user
            numberEntered =  keyboard.nextInt();
        }

        // if both largest and smallest are 0, and number is -99, 
        // user entered nothing, display a message about that
        // otherwise display the largest and smallest number
        if (largest == 0 && smallest == 0 && numberEntered == -99) {
            System.out.println("You didn't enter anything");
        } else {

            System.out.println("Largest was: " + largest);
            System.out.println("Smallest was: " + smallest);
        }
    }
}
