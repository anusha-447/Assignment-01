package com.assignment;

import java.util.Scanner;

public class SecondMinSecondMax {

	public static void main(String[] args) {
		 int  temp;
		 int[] a={1, 2, 5, 9, 6, 4, 7, 2};
	        for (int i = 0; i < a.length; i++) 
	        {
	            for (int j = i + 1; j <  a.length; j++) 
	            {
	                if (a[i] > a[j]) 
	                {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
	        System.out.println("Second Largest:"+a[a.length-2]);
	        System.out.println("Second Smallest:"+a[0]);
	    }

	}


