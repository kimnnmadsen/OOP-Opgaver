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
public class Bank {

    public static void main(String[] args) {
        System.out.println("--Add aCustomer called Kim with id 1");
        Customer aCustomer = new Customer("Kim", 1);
        System.out.println("--Add bCustomer Jenna with id 2 and balance 100");
        Customer bCustomer = new Customer("Jenna", 2, 100);
        System.out.println("--Deposit 100 to aCustomer (Kim)");
        aCustomer.deposit(100);
        System.out.println("--Withdraw 59 from aCustomer (Kim)");
        aCustomer.withdraw(59);
        System.out.println("--Get Balance from aCustomer (Kim)");
        System.out.println("Balance for Customer id:" + aCustomer.getId() + " is " + aCustomer.getBalance() + "€$");
        System.out.println("--Create aBank Customer Database");
        CustomerDatabase aBank = new CustomerDatabase();
        System.out.println("--Add aCustomer (Kim) to aBank");
        aBank.addCustomer(aCustomer);
        System.out.println("--Add bCustomer (Jenna) to aBank");
        aBank.addCustomer(bCustomer);
        System.out.println("--Print out all Customers");
        aBank.printCustumers();
        System.out.println("--Remove Customer with id: 1");
        aBank.removeCustomer(1);
        //aBank.removeCustomer(2);
        System.out.println("--Print out all Customers");
        aBank.printCustumers();
        System.out.println("--Add aCustomer (Kim) agian");
        aBank.addCustomer(aCustomer);
        System.out.println("--Print out all Customers");
        aBank.printCustumers();

    }
}
