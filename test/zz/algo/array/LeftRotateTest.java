package zz.algo.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeftRotateTest {

	@Test
	public void testRevert() {
		char[] arr = "abcdefg".toCharArray();
		LeftRotate.revert(arr, 0, 2);
		assertArrayEquals("cbadefg".toCharArray(), arr);
	}
	
	@Test
	public void testRevert2() {
		char[] arr = "abcdefg".toCharArray();
		LeftRotate.revert(arr, 3, 6);
		assertArrayEquals("abcgfed".toCharArray(), arr);
	}

	@Test
	public void testRevert3() {
		char[] arr = "abcdefg".toCharArray();
		LeftRotate.revert(arr, 0, 6);
		assertArrayEquals("gfedcba".toCharArray(), arr);
	}
	
	@Test
	public void testRotate() {
		char[] arr = "abcdefg".toCharArray();
		LeftRotate.leftRotate(arr, 3);
		assertArrayEquals("defgabc".toCharArray(), arr);
	}
}
