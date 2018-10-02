/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul9;

/**
 *
 * @author Kim Madsen <kmads18@student.sdu.dk>
 */
public class ProductDatabase {

    Product[] products;

    public ProductDatabase() {
        products = new Product[0];
        System.out.println("Empty database has been created!");
    }

    public void addProduct(Product product) {
        Product[] tempArray = new Product[products.length + 1];
        System.arraycopy(products, 0, tempArray, 0, products.length);
        tempArray[tempArray.length - 1] = product;
        System.out.println("Product id: " + product.getId() + " Name: " + product.getName() + " Price: " + product.getPrice() + " was added to the product database!");
        products = tempArray;
    }

    public void removeProduct(int id) {
        Product[] tempArray = new Product[products.length - 1];
        int indexcount = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tempArray[indexcount] = product;
                indexcount++;
            } else {
                System.out.println("Product Id: " + id + " Name: " + product.getName() + " has been removed from the Product Database!");
            }
        }
        products = tempArray;
    }

    public Product[] getProducts() {
        return products;
    }

    public void getTotal() {
        double pricetotal = 0.0;
        for (Product product : products) {
            if (product != null) {
                pricetotal += product.getPrice();
            }
        }
        System.out.println("Total of all products in the database: " + pricetotal);
    }

    public void printProducts() {
        for (Product product : products) {
            if (product != null) {
                System.out.println("Id: " + product.getId() + " Name: " + product.getName() + " Price: " + product.getPrice());
            }
        }
    }
}
