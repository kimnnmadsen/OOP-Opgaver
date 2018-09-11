/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * (Conversion from Cº to Fº and Fº to Cº) Write a program that displays the following two tables side by
 * side: Celsius Fahrenheit | Fahrenheit Celsius 0 32.000 | 20 −6.667 2 35.600 | 25 −3.889 ... 98 208.400 |
 * 265 129.444 100 212.000 | 270 132.222 *
 *
 *
 * @author admin
 */
public class fem5 {

    public static void main(String[] args) {
        System.out.println("Celcius\tFahrenheit\t|\tFahrenheit\tCelcius");
        for (int i = 0; i <=100; i = i + 2) {
                double f = (i * 9);
            double f2 = f / 5 + 32;
            int f3 = i / 2 * 5 + 20;
            double fc = (f3-32)/1.8;
            System.out.printf("%-3d\t   %1.3f\t|\t%-3d \t\t%1.3f \n", i,f2,f3,fc);

        }
    }

}
