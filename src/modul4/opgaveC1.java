/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

/**
 *
 * @author Kim Madsen <kmads18@student.sdu.dk>
 */
public class opgaveC1 {
    public static void main(String[] args) {
                // First we create an Array of the values we would like to use	    
        int[] radius = {1, 2, 3, 4, 5};

        // Then we create a for loop where we use each value from the array and print it together with the value squared times PI. 
        for (int i = 0; i < radius.length; i++) {
            System.out.println("The area of a circle with a radius of " + radius[i] + " is " + Math.PI * Math.pow(radius[i], 2));
        }
    }
}
