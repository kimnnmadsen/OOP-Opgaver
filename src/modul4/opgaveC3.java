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
public class opgaveC3 {

    public static void main(String[] args) {

        double[] temp = {21.5, 23.7, 19.6, 22.5, 25.3, 21.7, 18.9};
        for (int i = 0; i < temp.length - 1; i++) {
            System.out.println("The difference between " + temp[i] + " and " + temp[i + 1] + " is " + Math.round(Math.abs((temp[i + 1] - temp[i])) * 100.0) / 100.0);
        }

    }
}
