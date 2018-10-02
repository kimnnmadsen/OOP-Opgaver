/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 *
 * @author Kim Madsen <kmads18@student.sdu.dk>
 */

/*

*6.2 (Sum the digits in an integer) Write a method that computes the sum of the digits in an integer. 
Use the following method header:
public static int sumDigits(long n) 
For example, sumDigits(234) returns 9 (= 2 + 3 + 4). 
(Hint: Use the % operator to extract digits and the / operator to remove the extracted digit. 
For instance, to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10 (= 23). 
Use a loop to repeatedly extract and remove the digit until all the digits are extracted. 
Write a test program that prompts the user to enter an integer then displays the sum of all its digits. 
 */
public class opgave6to {
    public static int sumDigits(long n){
        int sum = 0; 
        long test  = n % 10;
        n = n /10;
        System.out.println(test);
        System.out.println(n);
        return sum;
    }
    public static void main(String[] args) {
        sumDigits(234);
    }
    
    
}

