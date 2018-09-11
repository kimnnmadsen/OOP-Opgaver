/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *Opgave B.4: Skriv et program, der givet en måneds nummer udskriver antallet af dage i denne måned.
 * @author admin
 */
public class opgaveB4 {

    public static void main(String[] args) {
        int month = 2;
        switch (month) {
            case 1:
                System.out.println("Jan. has 31 days");
                break;
            case 2:
                System.out.println("Feb. has 28 days (except for leap years where it has 29)");
                break;
            case 3:
                System.out.println("Mar. has 31 days");
                break;
            case 4:
                System.out.println("Apr. has 30 days");
                break;
            case 5:
                System.out.println("May has 31 days");
                break;
            case 6:
                System.out.println("Jun. has 30 days");
                break;
            case 7:
                System.out.println("Jul. has 31 days");
                break;
            case 8:
                System.out.println("Aug. has 31 days");
                break;
            case 9:
                System.out.println("Sep. has 30 days");
                break;
            case 10:
                System.out.println("Oct. has 31 days");
                break;
            case 11:
                System.out.println("Nov. has 30 days");
                break;
            case 12:
                System.out.println("Dec. has 31 days");
                break;
        }

    }

}
