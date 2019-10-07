/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4tranthanh;

import java.util.Scanner;

/**
 * Lab 4
 * Have the user enter a value greater or equal to -99 and less or equal to 99. Compute the total of valid values and average. 
 * November 5, 2018
 * Thanh Tran
 */
public class Lab4TranThanh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // declare variables
        int val;        // declare value entered by user
        double avg = 0;     // declare average 
        int temp;           // declare temp
        int sum = 0;        // declare sum
        int vcount = 0;     // declare count for valid integers
        int icount = 0;     // declare count for invalid integers
        
        do {
           
            Scanner input = new Scanner (System.in);        // scanner object created
            System.out.println ("Please enter a value that is greater or equal to -99 and less or equal to 99. Enter 100 to exit");     // ask user to enter a value
            val = input.nextInt();      // read the value user inputed and store into val
            
            // tells the computer what to do in terms of different conditions
            if (val <= 99 && val >= -99) {          
            
             //  temp = val;     // stores value into a temporary memory
                sum += val;    // takes each value and adds them up
            
                vcount++;       // count each valid entry
                                   
            } else      
                
                icount++;       // counts each invalid entry
            
        } while (val != 100);
        
        avg = (double)sum/vcount;      // computes average of valid values entered
        // print outputs to the user
        System.out.printf("Number of valid values entered: %+5d \n", vcount);
        System.out.printf("Number of invalid values entered: %+5d \n", (icount-1));     // print the number of invalid entries excluding 100      
        System.out.printf("Total of valid values: %+5d \n", sum);
        System.out.printf("Average of valid values: %+8.3f \n", avg);
 
    }
    
}
    
