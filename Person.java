package com.codewithterrymartin.businesspackage;

import com.codewithterrymartin.businesspackage.business.Company;

public class Person {
    private String firstName = "Jerry";
    private int age;
    private long id;
    private char middleInitial = 'J';
    private byte myByte;
    static private Company company = new Company();
    private NewsAgency agency;

    public static void main(String[] args) {
        System.out.println(company);
    }

}
