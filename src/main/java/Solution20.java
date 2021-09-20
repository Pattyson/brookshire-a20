/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Patrick Brookshire
 */

import java.util.Scanner;

public class Solution20 {

    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);
        double order, tax =0, total, subtotal;
        String state, county;

        System.out.println("What is the order amount?");
        order = input.nextDouble();

        System.out.println("What State do you live in?");
        state = input.next();

        System.out.println("What county do you live in?");
        county = input.next();

        if(state.equals("Wisconsion"))
            tax += 0.05;
        if(county.equals("Eau"))
            tax += 0.005;
        if(county.equals("Dunn"))
            tax += 0.004;

        if(state.equals("Illinois"))
            tax += 0.08;

        subtotal = order * tax;
        total = order + subtotal;

        double roundOff2 = Math.round(subtotal*100.0)/100.0;
        double roundOff = Math.round(total*100.0)/100.0;

        System.out.println("The tax is " + roundOff2 + ": \r\nThe total is " + roundOff);
    }

}
