package com.alogrithms.searching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
//        Best case complexity of Linear Search O(1).
//        Worst case is O(n) size of the array.
        int[] arr = {21, 2, 1,76,8};
        int[][] arr1 = {
                {5,4,1}, {3,2,6}
        };
        System.out.println(maxIn2d(arr1));
        System.out.println(Arrays.toString(search2d(arr1, 6)));

        System.out.println(linearSearch(arr, 8));

    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index =0 ; index < arr.length; index++){
            int element = arr[index];
            if(element  == target) {
                return index;
            }
        }

        return -1;
    }

    static int[] search2d(int[][] arr1, int target){
        for(int row = 0; row < arr1.length; row++){
            for(int col = 0; col < arr1[row].length; col++){
                if(arr1[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }
    static int maxIn2d(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
