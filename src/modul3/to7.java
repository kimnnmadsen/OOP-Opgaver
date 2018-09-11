package modul3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.Math;

/**
 *
 * @author admin
 */
public class to7 {

    public static void main(String[] args) {
        double minutes = 100000000;
        double years = Math.floor(minutes / 60 / 24 / 365);
        double days = minutes % (60 * 24 * 365) / 60 / 24;
        System.out.printf("%1.0f minutes is %1.0f years and %1.0f days\n", minutes, years, days);
    }
}
