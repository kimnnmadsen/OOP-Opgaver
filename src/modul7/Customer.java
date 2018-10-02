/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7;

/**
 *
 * @author Kim Madsen <kmads18@student.sdu.dk>
 */
public class Customer {

    String name;
    int id;
    double balance;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
        balance = 0;
        System.out.println("Customer id:" + id + " with name " + name + " has been added with Balance: " + balance);
    }

    public Customer(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        System.out.println("Customer id:" + id + " with name " + name + " has been added with Balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " has been added to Customer id:" + id + " Balance is now " + balance);

    }

    public void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println(amount + " has been withdrawn from Customer id:" + id + " Balance is now " + balance);
        } else {
            System.out.println("Not enough fonds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        if (name != null) {
            return name;
        } else {
            System.out.println("Name is null");
            return null;
        }
    }
}
