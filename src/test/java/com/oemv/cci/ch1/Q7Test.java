package com.oemv.cci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Q7Test {
	
	@Test
	public void testRotate1by1() {
		int[][] src = new int[][] { { 1 } };
		Assert.assertArrayEquals(src, Q7.rotate(src));
	}
	
	@Test
	public void testRotate2by2() {
		int[][] src = new int[][] { { 1, 2 }, 
									{ 3, 4 } };
		int[][] expected = new int[][] { { 3, 1 }, 
									     { 4, 2 } };
		Assert.assertArrayEquals(expected, Q7.rotate(src));
	}

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
	
	@Test
	public void testRotate5by5() {
		int[][] src = new int[][] { { 1,   2,  3,  4 ,  5}, 
									{ 6,   7,  8,  9 , 10}, 
									{ 11, 12, 13, 14 , 15}, 
									{ 16, 17, 18, 19 , 20}, 
									{ 21, 22, 23, 24 , 25}};
									
		int[][] expected= new int[][] { { 21, 16, 11,  6 , 1}, 
										{ 22, 17, 12,  7 , 2}, 
										{ 23, 18, 13,  8 , 3}, 
										{ 24, 19, 14,  9 , 4}, 
										{ 25, 20, 15, 10 , 5}};

		Assert.assertArrayEquals(expected, Q7.rotate(src));
	}

}
