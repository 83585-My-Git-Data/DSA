package com.sunbeam;

import java.util.Arrays;

public class SelectionSortMain {

	public static void selectionSort(int arr[], int N) {
		int comparision = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				comparision++;
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Number of Comparision - " + comparision);
	}

	public static void main(String[] args) {
		int arr[] = { 44, 11, 55, 22, 66, 33 };
		
		selectionSort(arr, arr.length);
	}

}
