package com.assignment;

public class CommonElementsInArrays {

	public static void main(String[] args) {
		int arr1[] = {1, 4, 25, 55, 78, 99};
		int arr2[] = {2, 3, 4, 34, 55, 68, 75, 78, 100};
		int arr3[] = {4, 55, 62, 78, 88, 98};
		int i = 0, j = 0, k = 0, x = 0;
		System.out.print("The common elements in 3 arrays are: ");
		while (i < arr1.length && j < arr2.length && k < arr3.length) {
		if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
		System.out.print(arr1[i] + " ");
		i++;
		j++;
		k++;
		}else if (arr1[i] < arr2[j]) {
		i++;
		}else if (arr2[j] < arr3[k]) {
		j++;
		}else {
		k++;
		}
		}

	}

}
