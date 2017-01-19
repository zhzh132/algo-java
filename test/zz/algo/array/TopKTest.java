package zz.algo.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class TopKTest {

	@Test
	public void test() {
		int[] arr = {1,5,3,6,8,2,4,7,9};
		int[] ret = TopK.top_K(arr, 3);
		assertArrayEquals(new int[]{1,2,3}, ret);
	}

	@Test
	public void test2() {
		int[] arr = {1,5,3,6,8,2,4,7,9};
		int[] ret = TopK.top_K(arr, 6);
		assertArrayEquals(new int[]{1,2,3,4,5,6}, ret);
	}
}
