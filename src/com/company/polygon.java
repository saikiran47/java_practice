package com.company;

import java.util.Scanner;

public class polygon {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numer of sides on the polygon = ");
        int s = scanner.nextInt();
        System.out.print("Enter the length of one of the sides = ");
        int l = scanner.nextInt();
        double  area = (l*Math.pow(s,2))/(4*Math.tan(Math.PI/l));
        System.out.println("Area of the polygon = "+area);
    }

}
