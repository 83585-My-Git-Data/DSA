package com.sunbeam;

import java.util.Arrays;

public class InsertionSortMain {
	
	public static int insertionsort(int arr[], int N) {
		int comparision = 0;
		for(int i = 1; i < N; i++) {
			int j = i - 1;
			int temp = arr[i];
			while(j >= 0) {
				comparision++;
				if( arr[j] > temp) {
					arr[j + 1] = arr[j];
				}
				else
					break;
				j--;
			}
			arr[j + 1] = temp;
		}
		return comparision;
	}

	public static void main(String[] args) {
		int arr[] = {55, 44, 22, 66, 11, 33}; 
		
		System.out.println("Array before sort: " + Arrays.toString(arr));
		
		int comparisons = insertionsort(arr, arr.length);
		
		System.out.println("Array after sort: "+ Arrays.toString(arr));
		
		System.out.println("Total Number of comparisions : " + comparisons);
	}

}
