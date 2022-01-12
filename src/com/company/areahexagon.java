package com.company;

public class areahexagon {
    public static void main(String[] args){
        int s = 6;
        double area = (6*Math.pow(s,2))/(4*Math.tan(Math.PI/6));
        System.out.println("Area of the hexagon = "+area);
    }
}
