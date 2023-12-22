package com.strings;

public class FirstOccurenceString {

    static int findFirstOccurence(String haystack, String needle){
        for(int i = 0; i <= haystack.length() - needle.length(); i ++){
            if(haystack.substring(i, i + needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "code";


        System.out.println(findFirstOccurence(haystack, needle));
    }
}
