package com.amazon.utils;

import java.util.Random;

public class EmailGen {
    public String random() {
        final String randomNumbers = "1234567890";
        final int N = randomNumbers.length();
        String emailNumber = "";
        Random r = new Random();
        String temp = "qatex";
        for (int i = 0; i < 5; i++) {
            emailNumber = String.valueOf(randomNumbers.charAt(r.nextInt(N)));
            temp += emailNumber;
        }
        String randomAcc = temp.concat("@nim.com");
        //System.out.println("\nUser: " + randomAcc);
        return randomAcc;
    }
}
