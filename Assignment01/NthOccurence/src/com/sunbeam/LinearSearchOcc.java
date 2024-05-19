package com.sunbeam;

import java.util.Scanner;

public class LinearSearchOcc {
	
	public static int linearSearch(int arr[], int N, int key) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(key == arr[i]) {
				count++;
				if(count == N)
					return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {11, 22, 33, 11, 22, 11, 44, 11};
		
		System.out.print("Enter the Key - ");
		int key = sc.nextInt();
		System.out.println("Enter the Occurence Number");
		int n = sc.nextInt();
		
		int index = linearSearch(arr, n, key);
		
		if(index != -1)
			System.out.println("Key of " + n + " Occurence was found at " + index + " Index");
		else
			System.out.println(n+ "th Occurence of "+ key+ " is not found");
	}

}
