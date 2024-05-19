package com.sunbeam;

import java.util.Scanner;

public class Rank {

	public static int rankFinder(int arr[],int Number) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(Number >= arr[i])
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		
		System.out.print("Enter the Number of which you want the rank - ");
		int Number = sc.nextInt();
		
		int rank = rankFinder(arr, Number);

		System.out.println("Rank of "+ Number + " = "+ rank);
	}

}
