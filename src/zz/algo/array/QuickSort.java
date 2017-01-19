package zz.algo.array;

import static zz.algo.Utils.swap;

public class QuickSort {

	public static void sort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}
	
	private static void quickSort(int[] arr, int start, int end) {
		if(start >= end) {
			return;
		}
		if(end - start == 1) {
			if(arr[start] > arr[end]) {
				swap(arr, start, end);
			}
			return;
		}
		
		int pivot = end;
		int i = start;
		int j = end - 1;
		while(i <= j) {
			while(arr[i] < arr[pivot]) i++;
			while(arr[j] >= arr[pivot]) j--;
			if(i < j) {
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		swap(arr, i, pivot);
		quickSort(arr, start, i - 1);
		quickSort(arr, i + 1, end);
	}
}
