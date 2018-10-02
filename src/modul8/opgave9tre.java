/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul8;

import java.util.Date;

/**
 *
 * @author Kim Madsen <kmads18@student.sdu.dk>
 */
public class opgave9tre {
    public static void main(String[] args) {
        Date date = new Date();
        for (long i = 100000; i <= 1e11; i *= 10) {
            date.setTime(i);
            System.out.println(date.toString());
        }
    }

}
