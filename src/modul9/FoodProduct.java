/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul9;
import java.time.*;
import java.time.format.DateTimeFormatter;

        
/**
 *
 * @author Kim Madsen <kmads18@student.sdu.dk>
 */
public class FoodProduct extends Product{
    LocalDate exp;
    double temp;
    public FoodProduct (int id, String name, double price, LocalDate exp, double temp){
        super(id,name,price);
        this.exp = exp;
        this.temp = temp;
    }
    
    @Override
    public String toString(){
        return super.getName() + " Udløber " + this.exp.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    
}
