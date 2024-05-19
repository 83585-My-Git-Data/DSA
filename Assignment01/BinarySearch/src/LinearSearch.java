import java.util.Scanner;

public class LinearSearch {
	
	public static int linSearch(int arr[], int n, int key) {
		for (int i = 0; i<n; i++) {
			if(key == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {22,44,33,55,66};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Key you want to search for : ");
		int key = sc.nextInt();
		int result = linSearch(arr,arr.length-1,key);
		result = result+1;
		if(result == -1) {
			System.out.println("Number Not found");
		} 
		else {
			System.out.println("Number found at Position :" + result );
		}
		
	}

	



}
