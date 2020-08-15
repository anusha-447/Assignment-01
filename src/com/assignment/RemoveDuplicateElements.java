package com.assignment;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		int[] array= {1,2,5,5,6,6,7,2};
		
		int n=array.length;
		System.out.println(n);
		int j=0;
		for (int i=0; i < n--; i++){
			
		    if(array[i]!=array[i+1]) {
		    	array[j++]=array[i];
		    	System.out.println(array[i]);
		    }
		    
	}
array[j++]=array[n-1];
}}
