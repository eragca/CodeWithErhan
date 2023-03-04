package com.codewitherhan.factorydesignpattern;

public class PhoneFactory {
    public PhoneMaker getPhoneProduct(String phoneType) {
        PhoneMaker phoneProduct = null;
        switch (phoneType.toLowerCase()) {
            case "samsung":
                phoneProduct = new Samsung();
                break;
            case "nokia":
                phoneProduct = new Nokia();
                break;
            case "iphone":
                phoneProduct = new IPhone();
                break;
            case "exit":
                throw new NullPointerException();
        }
        return phoneProduct;
    }
}
