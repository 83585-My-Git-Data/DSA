package com.sunbeam;

import java.util.Scanner;

public class BinarySearchMain {
	
	public static int binarySearch(int arr[], int N, int key) {
		int left = 0, right = N - 1;
		while(left <= right) {
			int mid = (left + right)/2;	
			if(key == arr[mid])
				return mid;
			else if(key < arr[mid])
				left = mid + 1;
			else
				right = mid - 1;	
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {99, 88, 77, 66, 55, 44, 33, 22, 11};

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the key: ");
		int key = sc.nextInt();
		
		int mid = binarySearch(arr, arr.length, key);
		
		if(mid != -1) {
			System.out.println("Key found  -> " + arr[mid] + " at " + mid);
		}
		else {
			System.out.println("Key not found.");
		}
		
		sc.close();
	}

}
