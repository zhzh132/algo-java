package zz.algo.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinHeapTest {

	@Test
	public void test() {
		int[] arr = new int[]{4,1,3,2,16,9,10,14,8,7};
		MinHeap mh = new MinHeap(arr);
		int[] exp = new int[]{1, 2, 3, 4, 7, 9, 10, 14, 8, 16};
		assertArrayEquals(exp, mh.toIntArray());
	}

}
