package com.strings;

import java.util.Scanner;

public class LargestString {

    public static String largestWord(String s){
        String[] wordsArray = s.split(" ");
        String longestWord = "";

        for(String word: wordsArray){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        return longestWord;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Largest word in sentence is: " + largestWord(s));
    }
}
