package zz.algo.string;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestCommonSubsequenceTest {

	@Test
	public void test() {
		String s1 = "ABCBDAB";
		String s2 = "BDCABA";
		String common = LongestCommonSubsequence.lcs(s1, s2);
		assertEquals("BCBA", common);
	}

}
