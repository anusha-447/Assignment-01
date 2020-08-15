package com.assignment;

public class ThirdHighestElementInArray {
	
	public static void main(String args[]){  
		
		int[] array={6, 8, 1, 9, 2, 1, 10};
		int temp;
		 for (int i = 0; i < array.length; i++) 
	        {
	            for (int j = i + 1; j <  array.length; j++) 
	            {
	                if (array[i] > array[j]) 
	                {
	                    temp = array[i];
	                    array[i] = array[j];
	                    array[j] = temp;
	                }
	            }
	        }
	        System.out.println("Second Largest:"+array[array.length-3]);
		
		
	}

}
