package com.assignment;

import java.util.Arrays;

public class SmallestPairInArray {

	public static void main(String[] args) {
		int[] array={1, 7, 2, 9, 6};
		Arrays.sort(array);
		int[] temp=new int[array.length];
		int j=0;
		for (int i = 0; i < array.length-1; i++) {
			if(array[i]!=array[i+1]) {
				temp[j++]=array[i];
			}

		}
		temp[j++]=array[array.length-1];
		System.out.println(temp[0]+","+temp[1]);

	}

}
