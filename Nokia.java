package com.codewitherhan.factorydesignpattern;

public class Nokia implements PhoneMaker{
    @Override
    public void makePhone(String ram, String storage, String color) {
            String line = getClass().toString();
            //System.out.println(line);
            int len = line.length();
            //System.out.println(len);
            String subS = line.substring(len-5, len);
            //System.out.println(subS);
            System.out.println(
                String.format("A %S Mobile Phone with %S GB RAM" +
                        " , %S GB Storage with %s color is PRODUCED. ",
                         subS,ram, storage, color));
    }
}
