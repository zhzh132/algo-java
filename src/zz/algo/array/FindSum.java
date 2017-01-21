package zz.algo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSum {

	public static int[] findSum2(int[] arr, int sum) {
		Arrays.sort(arr);
		int[] result = new int[2];
		int i = 0;
		int j = arr.length - 1;
		while(i < j) {
			if(arr[i] + arr[j] > sum) {
				j--;
			}
			else if(arr[i] + arr[j] < sum) {
				i++;
			}
			else {
				result[0] = arr[i];
				result[1] = arr[j];
				return result;
			}
		}
		return null;
	}
	
	public static ArrayList<Integer> findSumN(int[] arr, int sum) {
		ArrayList<Integer> result = new ArrayList<>();
		ArrayList<Integer> array = new ArrayList<>(arr.length);
		for(int a : arr) {
			array.add(a);
		}
			
		boolean found = _findNum(array, sum, result);
		if(found) {
			return result;
		}
		else {
			return null;
		}
	}
	
	private static boolean _findNum(List<Integer> arr, int sum, ArrayList<Integer> result) {
		if(sum == 0) {
			return true;
		}
		else if(sum < 0 || arr.isEmpty()) {
			return false;
		}
		
		int val = arr.get(0);
		List<Integer> newArr = arr.subList(1, arr.size());
		boolean found = _findNum(newArr, sum - val, result);
		if(found) {
			result.add(val);
			return found;
		}
		found = _findNum(newArr, sum, result);
		return found;
	}
}
