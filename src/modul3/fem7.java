/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author admin
 */
public class fem7 {

    public static void main(String[] args) {

        //Initial Tuition of $10000
        double tuition = 10000;
        //Anual Intrest on 6%
        double intrest = 0.06;
        //Calculate tuition based on 6% intrest over 10 years roundedto 2 decimals
        tuition = tuition * Math.pow(1 + intrest, 10);
        System.out.println("Tuition after 10 years is $" + Math.round(tuition*100.0)/100.0);

        // Calculate 4 years of tuition after 10 years of intrest rounded to 2 decimals
        double TotalCost = 0;
        for (int i = 0; i <= 3; i++) {
            TotalCost = TotalCost + tuition * Math.pow(1 + intrest, i);
        };
        System.out.println("Total Cost of 4 years after 10 years of intrest is $"+Math.round(TotalCost*100.0)/100.0);
    }
}
