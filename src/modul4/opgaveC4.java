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
public class opgaveC4 {

    public static void main(String[] args) {
        String[] days = {"31", "28 or 29 depending on leap years", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (int i = 0; i < days.length; i++) {
            System.out.println(months[i] + " has " + days[i] + " days");
        }
    }
}
