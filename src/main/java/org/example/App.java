package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App 
{

    static final double tax_rate = 0.055;

    public static void main( String[] args )
    {

        int[] price = new int[3], quantity = new int[3];

        double subtotal = 0.0, tax, total;

        String temp;

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 3; i++){

            System.out.print("Enter the price of item " + (i+1) + ": ");

            temp = s.nextLine();

            price[i] = String_to_int(temp);

            System.out.print("Enter the quantity of item " + (i+1) + ": ");

            temp = s.nextLine();

            quantity[i] = String_to_int(temp);

        }

        for(int i = 0; i < 3; i++){

            subtotal += price[i]*quantity[i];

        }

        tax = subtotal*tax_rate;

        total = subtotal + tax;

        System.out.print(String.format("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", subtotal, tax, total));

        s.close();

    }

    private static int String_to_int(String input){

        int ret = 0;

        for(int i = 0; i < input.length(); i++){

            ret += (input.charAt(i)-'0')*pow(10,input.length()-1-i);

        }

        return ret;

    }

    private static int pow(int base, int exp){

        int ret = 1;

        for(int i = 0; i < exp; i++){

            ret *= base;

        }

        return ret;

    }

}
