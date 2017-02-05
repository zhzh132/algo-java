package zz.algo.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void test() {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int idx = BinarySearch.binarySearch(arr, 4);
		assertEquals(3, idx);
	}

}
