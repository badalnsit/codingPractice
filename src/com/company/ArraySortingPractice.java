package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortingPractice {


    public static void main(String[] args){
        int[][] arr = { { 2,3}, {1,2},{10,8} , {9,2}, {1,1}};
        Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[0]).thenComparing((int[] o) -> o[1], Comparator.reverseOrder()));

        for(int i = 0 ; i < arr.length; i++){
            for( int j =0 ; j < arr[i].length; j ++){
                System.out.println(arr[i][j]);
            }
            System.out.println("\n");
        }

        Integer[] arr1 = { 10,1,3,2,5,7,8};
        int[] sortedArray = Arrays.stream(arr1).sorted().mapToInt(Integer::intValue).toArray();
        for(int element: sortedArray){
            System.out.println(element + " ");
        }

    }
}
