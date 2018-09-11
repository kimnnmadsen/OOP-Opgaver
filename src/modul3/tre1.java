/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

import java.lang.Math;

/**
 *
 * @author admin
 */
public class tre1 {

    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 1;
        double d = Math.pow(b, 2) - 4 * a * c;
        double r1 = (-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / 2 * a;
        double r2 = (-b - Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / 2 * a;
        if (d == 0) {
            System.out.println(r1);
        } else if (d > 0) {
            System.out.println(r1);
            System.out.println(r2);
        } else {
            System.out.println("The equation has no real roots");
        };
        System.out.println(d);
    }

}
