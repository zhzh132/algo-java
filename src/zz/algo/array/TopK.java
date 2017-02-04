package zz.algo.array;

import java.util.Arrays;
import static zz.algo.Utils.swap;

public class TopK {

	public static int[] top_K(int[] arr, int k) {
		int[] result = new int[k];
		quickselect(arr, 0, arr.length - 1, k, result);
		Arrays.sort(result);
		return result;
	}
	
	private static void quickselect(int[] arr, int start, int end, int k, int[] ret) {
		int pivot = arr[end];
		int p = end;
		int j = end - 1;
		int i = start;
		while (i <= j) {
			while (arr[j] >= pivot) {
				j--;
			}
			while (arr[i] < pivot) {
				i++;
			}
			if (i < j) {
				swap(arr, i, j);
				i++;
				j--;
			} 
		}
		swap(arr, i, p);
		p = i;
		if(p - start < k) {
			quickselect(arr, p + 1, end, k - p - 1, ret);
		}
		else if(p - start > k) {
			quickselect(arr, start, p - 1, k, ret);
		}
		else {
			for(int idx = 0; idx < p; idx++) {
				ret[idx] = arr[idx];
			}
		} 
	}
	
	public static int[] top_K_heap(int[] arr, int k) {
		int[] result = new int[k];
		for(int i = 0; i < k; i++) {
			result[i] = arr[i];
		}
		buildMinHeap(result);
		for(int i = k; i < arr.length; i++) {
			if(arr[i] > result[0]) {
				result[0] = arr[i];
				minHeapify(result, 0);
			}
		}
		Arrays.sort(result);
		return result;
	}
	
	private static void buildMinHeap(int[] a) {
		for(int i = a.length / 2 - 1; i >= 0; i--) {
			minHeapify(a, i);
		}
	}
	
	private static void minHeapify(int[] a, int i) {
		int l = i * 2 + 1;
		int r = i * 2 + 2;
		int smallest;
		if(l < a.length && a[l] <= a[i]) {
			smallest = l;
		}
		else {
			smallest = i;
		}
		if(r < a.length && a[r] <= a[smallest]) {
			smallest = r;
		}
		if(smallest != i) {
			swap(a, smallest, i);
			minHeapify(a, smallest);
		}
	}
}
