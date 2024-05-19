package com.sunbeam;

public class EmployeeMain {
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary;
	}

	int id;
	String name;
	double salary;

	public EmployeeMain() {}

	public EmployeeMain(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
	
	public static void insertionSort(EmployeeMain arr[], int N) {
		for (int i = 0; i < arr.length; i++) {
			int j = i - 1;
			EmployeeMain temp = arr[i];
			while(j >= 0 && arr[j].getSalary() > temp.getSalary()) {
				arr[i] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		EmployeeMain arr[] = new EmployeeMain[5];
		arr[0] = new EmployeeMain(1, "Abhay", 5000);
		arr[1] = new EmployeeMain(2, "Ranjit", 8000);
		arr[2] = new EmployeeMain(3, "Tushar", 10000);
		arr[3] = new EmployeeMain(4, "Ninad", 12000);
		arr[4] = new EmployeeMain(5, "Atharva", 18000);

		insertionSort(arr, arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
		
		
	}

}
