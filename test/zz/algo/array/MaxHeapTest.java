package zz.algo.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxHeapTest {

	@Test
	public void test() {
		int[] arr = new int[]{4,1,3,2,16,9,10,14,8,7};
		MaxHeap mh = new MaxHeap(arr);
		int[] exp = new int[]{16,14,10,8,7,9,3,2,4,1};
		assertArrayEquals(exp, mh.toIntArray());
	}

}
