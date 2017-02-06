package zz.algo.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxSubArrayTest {

	@Test
	public void test() {
		int[] arr = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
		int[] result = MaxSubArray.maxSubArray(arr);
		assertArrayEquals(new int[]{18,20,-7,12}, result);
	}

	@Test
	public void test2() {
		int[] arr = {-1,-1,-1,0};
		int[] result = MaxSubArray.maxSubArray(arr);
		assertNull(result);
	}
	
	@Test
	public void testSum() {
		int[] arr = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
		int result = MaxSubArray.maxSum(arr);
		assertEquals(43, result);
	}
	
	@Test
	public void test3() {
		int[] arr = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
		int[] result = MaxSubArray.maxSubArray2(arr);
		assertArrayEquals(new int[]{18,20,-7,12}, result);
	}

	@Test
	public void test4() {
		int[] arr = {-1,-1,-1,0};
		int[] result = MaxSubArray.maxSubArray2(arr);
		assertNull(result);
	}

}
