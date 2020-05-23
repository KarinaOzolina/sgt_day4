package com.company;

import org.w3c.dom.ls.LSOutput;

public class TernaryOperators {
    public static void main(String[] args) {

        int time = 20;

        if (time < 18) {
            System.out.println("Good day!");
        } else {
            System.out.println("Good evening!");
        }
        System.out.println("-------------------------");

        // Ternary Operator pieraksta veids - variable = Expression1 ? Expression2 : Expression3
        // Paskaidrojums -  condition ? value if TRUE : value if FALSE

        String result = time < 18 ? "Good day!" : "Good evening!";
        System.out.println(result);

    }
}
