
import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johnk
 */
public class Files {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Random rand = new Random();
        
        int randomInt = rand.nextInt();
        double randomDouble = rand.nextDouble();
        int rangedRandom = rand.nextInt(50);
        
        // random between two numbers
        Random r = new Random();
        int low = 10;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        
        
        PrintWriter settingsWriter = new PrintWriter("C:\\users\\johnk\\desktop\\settings.txt");
        settingsWriter.println("1");
        settingsWriter.println("john@dev-squared.com");
        settingsWriter.println("TRUE");
        settingsWriter.close();

        FileWriter fileWriter = new FileWriter("C:\\users\\johnk\\desktop\\settings.txt", true);
        PrintWriter writer2 = new PrintWriter(fileWriter);
        writer2.println("DARK");
        writer2.close();

        File settingsFile = new File("C:\\users\\johnk\\desktop\\settings.txt");
        Scanner inputFile = new Scanner(settingsFile);

        while (inputFile.hasNext()) {

            System.out.println(inputFile.nextLine());

        }

        inputFile.close();

        // example of reading a specific setting from the file
//        File settingsFile = new File("C:\\users\\johnk\\desktop\\settings.txt");
//        Scanner inputFile = new Scanner(settingsFile);
//        
//        int lineNumber = 1;
//        while (inputFile.hasNext()) {
//            
//            if (lineNumber == 2) {
//                System.out.println(inputFile.nextLine());
//            } else {
//                inputFile.nextLine();
//            }
//            
//            lineNumber++;
//        }
//        
//        inputFile.close();
    }
}
