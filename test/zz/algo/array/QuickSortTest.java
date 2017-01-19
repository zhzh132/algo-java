package zz.algo.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void test() {
		int[] arr = {1,5,3,6,8,2,4,7,9};
		QuickSort.sort(arr);
		assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9}, arr);
	}

	@Test
	public void test1() {
		int[] arr = {1};
		QuickSort.sort(arr);
		assertArrayEquals(new int[]{1}, arr);
	}
	
	@Test
	public void test2() {
		int[] arr = {5,3};
		QuickSort.sort(arr);
		assertArrayEquals(new int[]{3,5}, arr);
	}
}
