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

    public static class Customer {

        String name;
        int id;
        double balance;

        public Customer(String n, int i) {
            name = n;
            id = i;
            balance = 0;
            System.out.println("Customer id:"+id+" with name "+name+" has been added with Balance: "+balance);
        }

        public Customer(String n, int i, double b) {
            name = n;
            id = i;
            balance = b;
            System.out.println("Customer id:"+id+" with name "+name+" has been added with Balance: "+balance);
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println(amount+ " has been added to Customer id:"+id+" Balance is now "+balance);

        }

        public void withdraw(double amount) {
            if (balance > amount) {
                balance = balance - amount;
                System.out.println(amount+" has been withdrawn from Customer id:"+id+" Balance is now "+balance);
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

    public static class CustomerDatabase {
        Customer[] customers;

        public CustomerDatabase() {
            customers = new Customer[0];
            System.out.println("Empty database has been created");
        }

        public void addCustomer(Customer c) {
            Customer[] tempArray = new Customer[customers.length+1];
            System.arraycopy(customers, 0, tempArray, 0, customers.length);
            tempArray[tempArray.length - 1] = c;
            System.out.println("Customer id:"+c.getId()+" Name: "+c.getName()+" Balance: "+c.getBalance()+" has been added to the Customer Database");
            customers = tempArray;
        }

        public void removeCustomer(int i) {
            Customer[] tempArray = new Customer[customers.length - 1];
            int indexcount = 0;
            for (Customer customer : customers) {
                if (customer.getId() != i) {
                    tempArray[indexcount] = customer;
                    indexcount++;
                } else {
                    System.out.println("Customer Id: " + i + " has been removed from the Customer Database!");
                }
            }
            customers = tempArray;
        }

        public Customer[] getCustomers() {
            return customers;
        }

        public void printCustumers() {
            for (Customer customer : customers) {
                if (customer != null) {
                    System.out.println("Id: " + customer.getId() + " Name: " + customer.getName() + " Balance: " + customer.getBalance());
                }
            }
        }
    }

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
        System.out.println("Balance for Customer id:"+aCustomer.getId()+" is "+aCustomer.getBalance() + "€$");
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
