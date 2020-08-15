package com.assignment;

public class SumOfPaisInArray {

	public static void main(String[] args) {
		int[] array=  {7,8,3,6,12,8,9,-8,10 } ;
		int sum=16;
		for (int i=0;i<=array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]+array[j]==sum) {
					System.out.println(array[i]+","+array[j]);
				}
			}
		}

	}

}
