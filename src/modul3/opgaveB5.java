/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 * Opgave B.5: Skriv et program, der udregner alle primtal under 1.000.000, og udskriver det største.
 *
 * @author admin
 */
public class opgaveB5 {

    public static void main(String[] args) {
        //Initiliaze the prime variable so we can use it outside the loop
        int prime = 0;
        // For loop that runs until 1000000
        for (int i = 2; i < 1000000; i++) {
            boolean isPrime = true;
            //Check if prime, if not break
            for (int devisor = 2; devisor <= i / 2; devisor++) {
                if (i % devisor == 0) {
                    //System.out.println(i + " is not a prime.");
                    isPrime = false;
                    break;
                }
            }
            //If prime number is found set update prime with i
            if (isPrime) {
                //System.out.println(i + " is a prime.");
                prime = i;
            }
        }
        //Print out the highest prime number found
        System.out.println(prime + " is the highest prime.");
    }
}
