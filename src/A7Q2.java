
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petet9087
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new scanner
        Scanner input = new Scanner (System.in);
        // ask user for the number of people
        System.out.println("How many people are there?");
        // store user answer with a variable
        int people = input.nextInt();
        // create an array to store five marks
        double[] height = new double[people];
        // get the user to fil the array
        for (int i = 0; i < height.length; i++){
        System.out.println("Please enter the heights of the people " + (i+1));
        height[i] = input.nextDouble();
    }
        // add all numbers using a loop
        // start a total at zero
        double total = 0;
        // go through each number
        for (int i = 0; i < height.length; i++){
            // add the number into total
            total = total + height[i];
    }
        // calcualte the average
        double avg = total/height.length;
        // print out average to the user
        System.out.println("The Average of the class is " + avg );
        // print out above average height
        for( int i =0; i < height.length; i++){
        
        
        if (height[i] >= avg){
            System.out.println(height[i]);
        }
       
       }
    
    }
    
    
    
    }

