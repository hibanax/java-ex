package com.company;

public class Main {

    public static void main(String[] args) {
	ITelephone ChrisPhone;
	ChrisPhone = new DeskPhone(12345);
	ChrisPhone.powerOn();
	ChrisPhone.callPhone(12345);
	ChrisPhone.answer();

	ChrisPhone = new MobilePhone(2345);
	ChrisPhone.powerOn();
	ChrisPhone.callPhone(2345);
	ChrisPhone.answer();

    }
}
