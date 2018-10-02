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
public class NewClass {
    
    public static void main(String[] args) {
        Fan a = new Fan();
        Fan b = new Fan(2, false, 5, "blue");
        Date d = new Date();
        a.setSpeed(a.FAST);
        a.setRadius(10);
        a.setColor("yellow");
        a.setOn(true);
        System.out.println(a.toString());
        System.out.println(b.toString(d));
    }
}
