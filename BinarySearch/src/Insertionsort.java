import java.util.Arrays;

public class Insertionsort {
	
	public static void Insort(int arr[], int n) {
		for(int i= 1; i<n; i++) {
			int temp = arr[i];
			int j = i-1; 
			while(j >=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}	
			arr[j+1] = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = {55,44,22,33,11};
		System.out.println("Before Sorting : " + Arrays.toString(arr)); 
		Insort(arr, arr.length); 
		System.out.println("Before Sorting : " + Arrays.toString(arr)); 
		

	}

}
