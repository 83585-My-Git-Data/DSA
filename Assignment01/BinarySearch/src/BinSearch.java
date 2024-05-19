import java.util.Scanner;

//1.decide key to be searched
//2. start traversing from one end of collection
//3. compare key with each element of collection
//4. if key is found then stop searching and print/return the result
//5. if key is not found compare with next element of collection till
//last element


public class BinSearch {
	
	public static int binsearch(int arr[], int n, int key  ) {
		int left = 0, right = n-1, mid;
		
			while(left<=right) {
				mid = (left+right)/2;
				if(key == arr[mid]) {
					return mid;
				} 
				else if(key<arr[mid]) {
					right= mid-1;
				}
				else {
					left = mid+1;
				}
			}
		
		return -1;
	} 
	
	public static void main(String[] args) {
		
		int arr[] = {11,22,33,44,55,66}; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Key you want to Search : ");
		int key = sc.nextInt();
		
		int result = binsearch(arr, arr.length-1, key);
		if(result == -1) {
			System.out.println("Number Not Found !!!");
		} 
		else {
			System.out.println("Number Found at Index :" + result);
		}
		
		
		
		
	}

}
