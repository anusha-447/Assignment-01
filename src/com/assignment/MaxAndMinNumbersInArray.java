package com.assignment;

public class MaxAndMinNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1, 2, 5, 5, 6, 6, 7, 2};
		int max=array[0],min=array[0];
		for(int i=1; i<array.length; i++ ) {
			if(array[i]>max ) {
				max = array[i];


			}
			if(array[i]<min) {
				min = array[i];

			}

		}

		System.out.println(max +""+min);

	}


}


