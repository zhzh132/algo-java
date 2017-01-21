package zz.algo.array;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class FindSumTest {

	@Test
	public void test() {
		int[] arr = {1,2,4,7,11,15};
		int[] result = FindSum.findSum2(arr, 15);
		assertArrayEquals(new int[]{4,11}, result);
	}
	
	@Test
	public void test2() {
		int[] arr = {1,2,4,7,11,15};
		int[] result = FindSum.findSum2(arr, 10);
		assertNull(result);
	}
	
	@Test
	public void testN() {
		int[] arr = {1,2,4,7,11,15};
		ArrayList<Integer> result = FindSum.findSumN(arr, 5);
		assertEquals(2, result.size());
		assertTrue(result.contains(1));
		assertTrue(result.contains(4));
	}
	
	@Test
	public void testN2() {
		int[] arr = {1,2,4,7,11,15};
		ArrayList<Integer> result = FindSum.findSumN(arr, 21);
		assertEquals(4, result.size());
		assertTrue(result.contains(1));
		assertTrue(result.contains(2));
		assertTrue(result.contains(7));
		assertTrue(result.contains(11));
	}
	
	@Test
	public void testN3() {
		int[] arr = {1,2,4,7,11,15};
		ArrayList<Integer> result = FindSum.findSumN(arr, 41);
		assertNull(result);
	}
}
