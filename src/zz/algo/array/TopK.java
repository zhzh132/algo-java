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
	
}
