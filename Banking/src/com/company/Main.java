package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");

        if (bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch created");
        }

        bank.addCustomer("Adelaide", "Chris", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.33);
        bank.addCustomer("Adelaide", "Percy", 555.55);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Chris", 44.22);

        bank.addCustomerTransaction("Adelaide", "Chris", 12.34);

        bank.addCustomerTransaction("Adelaide", "Mike", 1.24);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");
        if (!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        bank.listCustomers("Melbourne", true);

        if (!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exist");
        }

        if (!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Adelaide", "Chris", 12.21)) {
            System.out.println("Customer Chris already exists.");
        }

    }
}

