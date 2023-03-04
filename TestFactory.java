package com.codewitherhan.factorydesignpattern;

import java.util.Scanner;

public class TestFactory {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        PhoneFactory factory = new PhoneFactory();

        System.out.println("Please Enter A Product Type to produce : ");
        String phoneType = input.next();

        System.out.println("Please Enter the RAM size : ");
        String ram = input.next();

        System.out.println("Please Enter Storage Capacity : ");
        String storage = input.next();

        System.out.println("Please Enter Color choice : ");
        String color = input.next();

        PhoneMaker phone = factory.getPhoneProduct(phoneType);

        phone.makePhone(ram, storage, color);


    }
}
