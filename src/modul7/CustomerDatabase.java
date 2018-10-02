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

    public class CustomerDatabase {
        Customer[] customers;

        public CustomerDatabase() {
            customers = new Customer[0];
            System.out.println("Empty database has been created");
        }

        public void addCustomer(Customer customer) {
            Customer[] tempArray = new Customer[customers.length + 1];
            System.arraycopy(customers, 0, tempArray, 0, customers.length);
            tempArray[tempArray.length - 1] = customer;
            System.out.println("Customer id:" + customer.getId() + " Name: " + customer.getName() + " Balance: " + customer.getBalance() + " has been added to the Customer Database");
            customers = tempArray;
        }

        public void removeCustomer(int id) {
            Customer[] tempArray = new Customer[customers.length - 1];
            int indexcount = 0;
            /*
            for (int j = 0; j < customers.length; j++) {
            customers[j] = customer
            }
            */
            for (Customer customer : customers) {
                if (customer.getId() != id) {
                    tempArray[indexcount] = customer;
                    indexcount++;
                } else {
                    System.out.println("Customer Id: " + id + " Name: " + customer.getName() + " Balance: " + customer.getBalance() + " has been removed from the Customer Database!");
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
