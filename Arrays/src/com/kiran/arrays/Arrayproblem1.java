package com.kiran.arrays;

public class Arrayproblem1 {

	public static void main(String[] args) {
		int arr1[]= {5,3,3,6,3,5,7};

		try{
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] == 5 && arr1[i+1] == 3) {
				arr1[i+1]=0;	
			}
		}
		
		for (int i : arr1) {
			System.out.print(i);
		}
		}
		catch(Exception e) {
			System.out.println("Array index out of bound");
		}
	}

}
