
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
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {

                // don't typically want to do this!
                if (j == 5) {
                    continue;
                }

                System.out.println(i + "," + j);

                // dont typically want to do this!
                if (j == 5) {
                    break;
                }

            }

        }

        System.out.println("Enter the sales data");
        double totalSales = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Enter sale #" + i);

            totalSales += keyboard.nextDouble();

            System.out.println("Total sales is now " + totalSales);
        }

        // this will happen at least one time!
        do {
            System.out.println("I'm in this loop!");
        } while (100 > 200);

        System.out.println("Enter a number between 1 and 50");

        int numberToCheck = keyboard.nextInt();

        while (numberToCheck < 1 || numberToCheck > 50) {
            System.out.println("Hey! That isn't between 1 and 50");

            numberToCheck = keyboard.nextInt();
        }

        int number = 1;

        number = number + 1;
        // number is now 2

        number++;
        // number is now 3

        ++number;
        // number is now 4

        number += 1;
        // number is now 5

        int x = 20;
        while (x > 0) {
            System.out.println("The value of x is: " + x);
            x--;
        }

        // this will not hit!
        while (x > 0) {
            System.out.println("Second time: The value of x is: " + x);
            x--;
        }

    }
}
