package com.company;
import java.util.Scanner;

public class CBSEmarksCalculator {
    public static void main(String[] args) {
        {
            System.out.println("Welcome Enter your Marks here");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Marks For S1");
            float s1 = input.nextFloat();
            System.out.println("Enter Marks For S2");
            float s2 = input.nextFloat();
            System.out.println("Enter Marks For S3");
            float s3 = input.nextFloat();
            System.out.println("Enter Marks For S4");
            float s4 = input.nextFloat();
            System.out.println("Enter Marks For S5");
            float s5 = input.nextFloat();
            float total = (s1 + s2 + s3 + s4 + s5) * 100 / 500;
            System.out.println("Your Total Percentage is" + total + "Percentage");
        }
    }
}