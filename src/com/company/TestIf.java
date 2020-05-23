package com.company;

public class TestIf {
    public static void main(String[] args) {
        // Create check of temperature if temp is higher than 80.1 print hot

        double temperature = 70;

        if (temperature >= 80.1) {
            System.out.println("Hot!");
        } else {
            System.out.println("Ok!");
        }

        System.out.println("----------------------");

        // Create if else if() where temp. more than 80.1 print (Hot)
        // from 75 to 80 print "Just right!" and less than 75 "Cold"

        double temp = 75;

        if (temp >= 80.1) {
            System.out.println("Hot!");
        } else if (temp < 75) {
            System.out.println("Cold!");
        } else {
            System.out.println("Just right!");
        }
    }
}
