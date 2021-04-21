package com.krystek;

public class Main {

    public static void main(String[] args) {

//        Account bobsAccount = new Account(); //"12345", 0.00, "Bob Brown", "myemail@bob.com", "505192354" );
////        System.out.println(bobsAccount.getNumber());
////        System.out.println(bobsAccount.getBalance());
////        bobsAccount.withdrawal(100.0);
////
////        bobsAccount.deposit(50.0);
////        bobsAccount.withdrawal(100.0);
////
////        bobsAccount.deposit(51.0);
////        bobsAccount.withdrawal(100.0);
////
        Account timsAccount = new Account("Tim", "tim@email.com","12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
        System.out.println("Current balance is " + timsAccount.getBalance());
        timsAccount.withdrawal(100.55);
        System.out.println("Current balance is " + timsAccount.getBalance());

        VipCustomer Krystian = new VipCustomer();
        System.out.println(Krystian.getName());
        System.out.println(Krystian.getCreditLimit());

        VipCustomer Krystian2 = new VipCustomer("Bob", 25000.00);
        System.out.println(Krystian2.getName());
        System.out.println(Krystian2.getCreditLimit());
        System.out.println(Krystian2.getEmailAddress());

        VipCustomer Krystian3 = new VipCustomer("Krystian", 30000.00, "super@gmail.com");
        System.out.println(Krystian3.getEmailAddress());

        VipCustomer Krystian4 = new VipCustomer(50000.00, "bujbub@mom.pl");
        System.out.println(Krystian4.getName());

        VipCustomer k5 = new VipCustomer();
        System.out.println(k5.getName());
        System.out.println(k5.getEmailAddress());


    }
}
