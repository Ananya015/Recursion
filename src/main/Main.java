/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 16/01/20
 *   Time: 8:57 AM
 */

package main;

import recursion.FactorialCalculator;
import recursion.FibonacciTermCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //FactorialCalculator calculator = new FactorialCalculator();
       // final Scanner scanner = new Scanner(System.in);
       // System.out.println("Enter the number you want to find the factorial for: ");
        //int number = scanner.nextInt();
        //int calculatedFactorial = calculator.calculateFactorial(number);
        //System.out.println("The factorial of " + number + " is : " + calculatedFactorial);
        FibonacciTermCalculator fb=new FibonacciTermCalculator ();
        final Scanner scanner = new Scanner(System.in);
        System.out.println ("enter positon");
        int num=scanner.nextInt ();
        int result=fb.nTHTermCalculator (num);
        System.out.println (result);
    }
}
