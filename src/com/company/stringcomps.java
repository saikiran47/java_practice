package com.company;

import java.util.Scanner;

public class stringcomps {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = scanner.nextLine();
        numberof(s);



    }public static void numberof( String s){
        char[] x = s.toCharArray();
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;
        for (int i = 0; i< s.length(); i++){
            if (Character.isLetter(x[i])){
                letter++;
            }if (Character.isSpaceChar(x[i])){
                space++;
            }if (Character.isDigit(x[i])){
                number++;
            }else {
                other++;
            }

        }System.out.println("the string is : "+s);
        System.out.println("The number of letters : "+letter);
        System.out.println("The number of spaces : "+space);
        System.out.println("The number of numbers : "+number);
        System.out.println("The number of other char : "+other);

    }
}
