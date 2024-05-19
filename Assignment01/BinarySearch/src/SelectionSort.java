import java.util.Arrays;

public class SelectionSort {
	
	public static void selsort(int arr[], int n) {
		for (int i=0; i<n; i++) {
			for (int j = i+1; j<n; j++ ){
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} 
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {33,22,55,11,44,66};
		System.out.println("Array before sorting"+ Arrays.toString(arr));
		
		selsort(arr,arr.length); 
		System.out.println("Array after sorting" + Arrays.toString(arr));
		
		
	}

}
