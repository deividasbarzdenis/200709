package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int x=sc.nextInt();
            int z=4/x;
            System.out.println(z);
        }catch (ArithmeticException ex){
            System.out.println("b/by zero");
        }finally {

            sc.close();
            System.out.println("finally");
        }
	// write your code here
    }
}
