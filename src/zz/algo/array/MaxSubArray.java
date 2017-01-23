package zz.algo.array;

import java.util.Arrays;

public class MaxSubArray {

	public static int[] maxSubArray(int[] arr) {
		int i = 0;
		while(i < arr.length && arr[i] <= 0) {
			i++;
		}
		Solution best = null;
		
		while(i < arr.length) {
			Solution s = findSolution(arr, i);
			if(best == null || s.max_sum > best.max_sum) {
				best = s;
			}
			i = findNextPos(arr, i);
		}
		if(best != null) {
			return Arrays.copyOfRange(arr, best.i, best.j);
		}
		return null;
	}
	
	private static int findNextPos(int[] arr, int from) {
		int i = from;
		while(i < arr.length && arr[i] >= 0) {
			i++;
		}
		if(i < arr.length) {
			while(i < arr.length && arr[i] <= 0) {
				i++;
			}
		}
		return i;
	}
	
	private static Solution findSolution(int[] arr, int from) {
		Solution s = new Solution();
		s.i = from;
		s.j = from + 1;
		s.max_sum = arr[from];
		
		for(int j = s.j, max = s.max_sum; j < arr.length; j++) {
			max += arr[j];
			if(max < 0) {
				return s;
			}
			if(max > s.max_sum) {
				s.max_sum = max;
				s.j = j + 1;
			}
		}
		return s;
	}
	
	static class Solution {
		int i = 0;
		int j = 0;
		int max_sum = 0;
	}
	
	
	public static int maxSum(int[] arr) {
		int maxSum = 0;
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(sum > maxSum) {
				maxSum = sum;
			}
			else if(sum < 0) {
				sum = 0;
			}
		}
		return maxSum;
	}
}
