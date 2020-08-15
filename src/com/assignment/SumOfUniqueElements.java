package com.assignment;

import java.util.Arrays;

public class SumOfUniqueElements {

	public static void main(String[] args) {
		int arr1[] = {1, 6, 4, 3, 2, 2, 3, 8, 1};
		Arrays.sort(arr1);
		 int current = arr1[0];
	        int sum = arr1[0];
	        for (int i = 1; i <arr1.length ; i++) {
	            if(current!=arr1[i]) {
	                sum += arr1[i];
	                current = arr1[i];
	            }
	        }
	        System.out.println(sum);
	}

}
