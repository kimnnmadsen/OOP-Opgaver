/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul9;
import java.time.*;



/**
 *
 * @author Kim Madsen <kmads18@student.sdu.dk>
 */
public class Store {
    public static void main(String[] args) {
        NonfoodProduct a = new NonfoodProduct(1,"Gaffel",10.0, new String[]{"Rustfrit stål","Plastik"});
        NonfoodProduct b = new NonfoodProduct(2,"Kniv",11.0, new String[]{"Rustfrit stål"});
        FoodProduct c = new FoodProduct(3,"Kage",5,LocalDate.of(2018,9,13),18.0);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        ProductDatabase Lager = new ProductDatabase();
        Lager.addProduct(a);
        Lager.addProduct(b);
        Lager.addProduct(c);
        Lager.getProducts();
        Lager.removeProduct(2);
        Lager.getProducts();
        Lager.getTotal();
    }
    
}
