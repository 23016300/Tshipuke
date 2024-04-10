package com.mycompany.tshipuke;

import java.util.Scanner;
public class Tshipuke{
    public static void main(String args []){
        Scanner zwiala=new Scanner(System.in);
         double A,P,I,N;
         
         System.out.println("enter the principle amount");
         P=zwiala.nextDouble();
         System.out.println("enter the annual interest");
         I=zwiala.nextDouble();
         System.out.println("enter the period");
         N=zwiala.nextDouble();
         
         A=P*Math.pow((1+I),N);
         System.out.println("find the amount is"+A);
    }
}
