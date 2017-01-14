package zz.algo.string;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringDistanceTest {

	@Test
	public void test() {
		int d = StringDistance.calcDistance("ivan", "ivan");
		assertEquals(0, d);
	}

	@Test
	public void test2() {
		int d = StringDistance.calcDistance("ivan1", "ivan2");
		assertEquals(1, d);
	}
	
	@Test
	public void test3() {
		int d = StringDistance.calcDistance("kitten", "sitting");
		assertEquals(3, d);
	}
	
	@Test
	public void testDP() {
		int d = StringDistance.calcDistanceDP("ivan", "ivan");
		assertEquals(0, d);
	}

	@Test
	public void testDP2() {
		int d = StringDistance.calcDistanceDP("ivan1", "ivan2");
		assertEquals(1, d);
	}
	
	@Test
	public void testDP3() {
		int d = StringDistance.calcDistanceDP("kitten", "sitting");
		assertEquals(3, d);
	}
	
	@Test
	public void testMemo() {
		int d = StringDistance.calcDistanceMemo("ivan", "ivan");
		assertEquals(0, d);
	}

	@Test
	public void testMemo2() {
		int d = StringDistance.calcDistanceMemo("ivan1", "ivan2");
		assertEquals(1, d);
	}
	
	@Test
	public void testMemo3() {
		int d = StringDistance.calcDistanceMemo("kitten", "sitting");
		assertEquals(3, d);
	}
}
