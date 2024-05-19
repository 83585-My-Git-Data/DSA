import java.util.Arrays;

public class Insertionsort2 {
	public static void Insort2(int arr[], int n) {
		for (int i=1; i<n; i++) {
			int temp = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j]; 
				j--;
			}
			arr[j+1] = temp;
		}
	}
	public static void main(String[] args) {
		int arr[] = {44,33,55,11,22,66};
		System.out.println("Before sorting " + Arrays.toString(arr));
		Insort2(arr,arr.length);
		System.out.println("Before sorting " + Arrays.toString(arr));

	}

}
