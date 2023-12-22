package com.patterns;

import java.util.Scanner;

//****
//****
//****
//****
public class Pattern1 {
    static void pattern1(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines or rows");
        int lines = sc.nextInt();
        pattern1(lines);

    }
}
