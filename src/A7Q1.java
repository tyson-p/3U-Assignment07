
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petet9087
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // create a new scanner
        Scanner input = new Scanner (System.in);
        // create an array to store five marks
    double[] marks = new double[3];
    // get the user to fil the array
    for (int i = 0; i < marks.length; i++){
        System.out.println("Please enter in mark " + (i+1));
        marks[i] = input.nextDouble();
    }
        // add all numbers using a loop
        // start a total at zero
        double total = 0;
        // go through each number
        for (int i = 0; i < marks.length; i++){
            // add the number into total
            total = total + marks[i];
    }
        // calcualte the average
        double avg = total/marks.length;
        // print out average to the user
        System.out.println("The Average of the class is " + avg + "%");
    
    
    
    }
}
