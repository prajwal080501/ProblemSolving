package com.patterns;

//*
//**
//***
//****


public class Pattern2 {

    static void pattern2(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern2(n);
    }
}
