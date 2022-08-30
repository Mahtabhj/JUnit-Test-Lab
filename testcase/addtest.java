package testcase;

import static org.junit.Assert.*;

import org.junit.Test;

public class addtest {

	@Test
	public void addtest1() {
		junittest junit = new junittest();
		int result = junit.max(10,100);
		assertEquals(100, result);
	}
	@Test
	public void addtest2() {
		junittest junit = new junittest();
		int result = junit.max(100,100);
		assertEquals(100, result);
	}
	@Test
	public void addtest3() {
		junittest junit = new junittest();
		int result = junit.max(100,10);
		assertEquals(100, result);
	}
	@Test
	public void addtest4() {
		junittest junit = new junittest();
		boolean result = junit.isPrintable("fdfgg");
		assertEquals(true, result);
	}
	@Test
	public void addtest5() {
		junittest junit = new junittest();
		boolean result = junit.isPrintable("h");
		assertEquals(true, result);
	}
	@Test
	public void addtest6() {
		junittest junit = new junittest();
		boolean result = junit.isPrintable("fghhhhhhhh");
		assertEquals(true, result);
	}
	@Test
	public void addtest7() {
		junittest junit = new junittest();
		boolean result = junit.isPrintable("ggfgfgfgfgf");
		assertEquals(false, result);
	}
	@Test
	public void addtest8() {
		junittest junit = new junittest();
		boolean result = junit.isPrintable("");
		assertEquals(false, result);
	}
	@Test
	public void addtest9() {
		junittest junit = new junittest();
		boolean result = junit.isPrintable("");
		assertEquals(false, result);
	}
	


}
