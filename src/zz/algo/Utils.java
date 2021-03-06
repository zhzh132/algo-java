package zz.algo;

public class Utils {

	public static int minValue(int val, int... val2) {
		int min = val;
		for(int v : val2) {
			if(v < min) {
				min = v;
			}
		}
		return min;
	}
	
	public static int maxValue(int val, int... val2) {
		int max = val;
		for(int v : val2) {
			if(v > max) {
				max = v;
			}
		}
		return max;
	}
	
	public static int factorial(int n) {
		int result = 1;
		while(n > 0) {
			result *= n;
			n--;
		}
		return result;
	}
	
	public static void swap(int[] arr, int i, int j) {
		if(i == j) {
			return;
		}
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
