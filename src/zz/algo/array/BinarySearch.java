package zz.algo.array;

public class BinarySearch {

	public static int binarySearch(int[] arr, int val) {
		int i = 0;
		int j = arr.length - 1;
		while(i <= j) {
			int mid = i + (j - i) / 2;
			if(arr[mid] < val) {
				i = mid + 1;
			}
			else if(arr[mid] > val) {
				j = mid - 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
}
