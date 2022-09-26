package com.yash.tranning.Array;

import java.util.Scanner;

public class Example6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter array elemnts : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int n = arr.length;

		pairwiseSum(arr, n);
	}

	static void pairwiseSum(int arr[], int n) {
		int sum = 0;
		for (int i = 0; i + 1 < n; i++) {
			sum = arr[i] + arr[i + 1];
			System.out.print(sum + " ");
		}
	}

}
