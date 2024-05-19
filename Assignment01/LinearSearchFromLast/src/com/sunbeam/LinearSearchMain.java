package com.sunbeam;

import java.util.Scanner;

public class LinearSearchMain {

	public static int linearSearch(int arr[], int N, int key) {
		for(int i = N - 1; i > 0; i++) {
			if(arr[i] == key)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {22, 55, 44, 99, 77, 66, 11, 33, 88, 99};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the key :");
		int key = sc.nextInt();
		
		int index = linearSearch(arr, arr.length, key);
		
		if(index != -1)
			System.out.println("Key is found -> " + arr[index]+ " at " + index);
		else
			System.out.println("Key is not found");
		sc.close();
	}
}
