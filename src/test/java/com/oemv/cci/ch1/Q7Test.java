package com.oemv.cci.ch1;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Q7Test {

	@Ignore
	@Test
	public void testRotate1by1() {
		int[][] src = new int[][] { { 1 } };
		Assert.assertArrayEquals(src, Q7.rotate(src));
	}

	@Ignore
	@Test
	public void testRotate2by2() {
		int[][] src = new int[][] { { 1, 2 }, 
									{ 3, 4 } };
		int[][] expected = new int[][] { { 3, 1 }, 
									     { 4, 2 } };
		Assert.assertArrayEquals(expected, Q7.rotate(src));
	}

	@Ignore
	@Test
	public void testRotate3by3() {
		int[][] src = new int[][] { { 1, 2, 3 }, 
									{ 4, 5, 6 }, 
									{ 7, 8, 9 } };
									
		int[][] expected = new int[][] { { 7, 4, 1 }, 
									     { 8, 5, 2 }, 
									     { 9, 6, 3 } };
		Assert.assertArrayEquals(expected, Q7.rotate(src));

	}

	@Test
	public void testRotate4by4() {
		int[][] src = new int[][] { { 1,   2,  3,  4 }, 
									{ 5,   6,  7,  8 }, 
									{ 9,  10, 11, 12 }, 
									{ 13, 14, 15, 16 } };
									
		int[][] expected = new int[][] { { 13,  9, 5, 1 }, 
									     { 14, 10, 6, 2 }, 
									     { 15, 11, 7, 3 }, 
									     { 16, 12, 8, 4 } };
		
		Assert.assertArrayEquals(expected, Q7.rotate(src));
	}

}
