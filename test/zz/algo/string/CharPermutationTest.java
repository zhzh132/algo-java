package zz.algo.string;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class CharPermutationTest {

	@Test
	public void test() {
		List<String> p = CharPermutation.permutation("abc");
		
		assertEquals(6, p.size());
		assertTrue(p.contains("abc"));
		assertTrue(p.contains("acb"));
		assertTrue(p.contains("bac"));
		assertTrue(p.contains("bca"));
		assertTrue(p.contains("cab"));
		assertTrue(p.contains("cba"));
	}

}
