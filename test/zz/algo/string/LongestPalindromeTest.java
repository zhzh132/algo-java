package zz.algo.string;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestPalindromeTest {

	@Test
	public void test1() {
		String lp = LongestPalindrome.longestPalindrome("a");
		assertEquals("a", lp);
	}
	
	@Test
	public void test2() {
		String lp = LongestPalindrome.longestPalindrome("aa");
		assertEquals("aa", lp);
	}
	
	@Test
	public void test3() {
		String lp = LongestPalindrome.longestPalindrome("madam");
		assertEquals("madam", lp);
	}

	@Test
	public void test4() {
		String lp = LongestPalindrome.longestPalindrome("ababbaba");
		assertEquals("ababbaba", lp);
	}
	
	@Test
	public void test5() {
		String lp = LongestPalindrome.longestPalindrome("cababbaba");
		assertEquals("ababbaba", lp);
	}
	
	@Test
	public void test6() {
		String lp = LongestPalindrome.longestPalindrome("cmadam");
		assertEquals("madam", lp);
	}
}
