package com.company;

import java.util.Scanner;

public class sumofdigits {

        public static void main(String[] args) {
            System.out.println("Sum of the digits of an integer");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input an integer : ");
            int x = scanner.nextInt();
            System.out.println("sum of the digits = "+sumofdigit(x));
        }
        public static int sumofdigit(int x){
            int sum = 0;
            while (x != 0){
                sum = sum+x%10;
                x = x/10;
            }
            return sum;
    }

}



