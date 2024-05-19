package com.sunbeam;

public class Element {
	
	public static int nonRepeatingEl(int arr[], int N) {
		for (int i = 0; i < arr.length - 1; i++) {
			int flag = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j])
					flag = 0;		
			}
			if(flag == 1)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 2, 4, -1, 7, 8 };
		
		int Number = nonRepeatingEl(arr, arr.length);
		
		if(Number != -1)
			System.out.println(arr[Number]);
		else
			System.out.println("No such Number found");
	}

}
