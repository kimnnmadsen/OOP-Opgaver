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
public class opgaveC6 {

    public static void main(String[] args) {
        int[] array = {1, 2, 7, 9, 2, 1, 3, 39, 2, 1, 5};
        int HighestIndex = 0;
        int HighestNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > HighestNumber) {
                HighestNumber = array[i];
                HighestIndex = i;
            }
        }
        System.out.println("The index of the highest number is " + HighestIndex);

    }

}
