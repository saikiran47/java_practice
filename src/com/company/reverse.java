package com.company;

import java.util.Scanner;

public class reverse {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string : ");
        char[] letter = scanner.nextLine().toCharArray();
        System.out.print("Reverse string : ");
        for (int i = letter.length-1;i>=0;i--){
            System.out.print(letter[i]);
        }

    }
}
