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
public class fem3 {
    public static void main(String[] args) {
        System.out.println("Celcius Fahrenheit");
        for (int i=0;i<=100;i=i+2){
            double f = i*9./5+32;
            //double f2 = f/;
            System.out.printf("%-3d\t%2.1f\n",i,f);
        }
    }
}
