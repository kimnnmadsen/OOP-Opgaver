/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul9;

import java.util.Arrays;

/**
 *
 * @author Kim Madsen <kmads18@student.sdu.dk>
 */
public class NonfoodProduct extends Product {

    String[] materials;

    public NonfoodProduct(int id, String name, double price, String[] materials) {
        super(id, name, price);
        this.materials = materials;
    }

    @Override
    public String toString() {
        return super.getName() + " indeholder: " + Arrays.toString(this.materials);
    }
}
