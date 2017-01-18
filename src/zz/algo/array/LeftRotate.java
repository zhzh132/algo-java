package zz.algo.array;

public class LeftRotate {

	public static void leftRotate(char[] arr, int n) {
		n = n % arr.length;
		revert(arr, 0, n - 1);
		revert(arr, n, arr.length - 1);
		revert(arr, 0, arr.length - 1);
	}
	
	public static void revert(char[] arr, int start, int end) {
		for(; start < end; start++, end--) {
			char tmp = arr[start];
			arr[start] = arr[end];
			arr[end] = tmp;
		}
	}
}
