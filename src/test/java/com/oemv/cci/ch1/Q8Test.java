package com.oemv.cci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Q8Test {

	@Test
	public void testZerofy1by1_1() {
		int[][] src = new int[][] { { 0 } };
		Assert.assertArrayEquals(src, Q8.zerofy(src));
		
		 src = new int[][] { { 1 } };
		Assert.assertArrayEquals(src, Q8.zerofy(src));
	}
	
	@Test
	public void testZerofy2by2_1() {
		int[][] src = new int[][] {{ 1, 2 }, 
								   { 3, 4 }};
		Assert.assertArrayEquals(src, Q8.zerofy(src));
		
		src = new int[][] {{ 1, 0 }, 
						   { 3, 4 }};
		int[][] expected = new int[][] {{ 0, 0 }, 
								 		{ 3, 0 }};
		Assert.assertArrayEquals(expected, Q8.zerofy(src));
	}

	@Test
	public void testZerofy3by3_1() {
		int[][] src = new int[][] {{ 1, 2, 3 }, 
								   { 4, 5, 6 }, 
								   { 7, 8, 9 } };
		Assert.assertArrayEquals(src, Q8.zerofy(src));
		
		src = new int[][] {{ 1, 2, 3 }, 
						   { 4, 0, 6 }, 
						   { 7, 8, 9 }};
			
		int[][] expected = new int[][] {{ 1, 0, 3 }, 
			     				        { 0, 0, 0 }, 
			     				        { 7, 0, 9 }};
	    Assert.assertArrayEquals(expected, Q8.zerofy(src));

	}

	@Test
	public void testZerofy4by4_1() {
		int[][] src = new int[][] {{ 1,   2,  3,  4 }, 
								   { 5,   6,  7,  8 }, 
								   { 9,  10, 11, 12 }, 
								   { 13, 14, 15, 16 }};
		
		Assert.assertArrayEquals(src, Q8.zerofy(src));
		
		
		src = new int[][] {{ 1,   2,  3,  4 }, 
						   { 5,   0,  7,  8 }, 
						   { 9,   0, 11, 12 }, 
						   { 13, 14, 15, 16 }};
			
		int [][] expected = new int[][] {{  1, 0,  3,  4 }, 
			     				 		 {  0, 0,  0,  0 }, 
			     				 		 {  0, 0,  0,  0 }, 
			     				 		 { 13, 0, 15, 16 }};

	     Assert.assertArrayEquals(expected, Q8.zerofy(src));
	}
	
	@Test
	public void testZerofy5by5_1() {
		int[][] src = new int[][] {{ 1,   2,  3,  4 ,  5}, 
								   { 6,   7,  8,  9 , 10}, 
								   { 11, 12, 13,  14, 15}, 
								   { 16, 17, 18, 19 , 20}, 
								   { 21, 22, 23, 24 , 25}};

		Assert.assertArrayEquals(src, Q8.zerofy(src));
		
		src = new int[][] {{  0,  2,  3,  4 ,  5}, 
			   			   {  6,  7,  8,  9 , 10}, 
			   			   { 11, 12,  0,  14, 15}, 
			   			   { 16, 17, 18, 19 , 20}, 
			   			   { 21, 22, 23, 24 ,  0}};
		
		int[][] expected = new int[][] {{ 0,  0, 0,  0 , 0}, 
									    { 0,  7, 0,  9 , 0}, 
										{ 0,  0, 0,  0 , 0}, 
										{ 0, 17, 0, 19 , 0}, 
										{ 0,  0, 0,  0 , 0}};

		Assert.assertArrayEquals(expected, Q8.zerofy(src));
	}
	
	@Test 
	public void testZerofy2by6_1(){
		int[][] src = new int[][]{{1,2,3, 4, 5, 6},
								  {7,8,9,10,11,12}};
								  
		Assert.assertArrayEquals(src, Q8.zerofy(src));
		
		src = new int[][]{{1,2,3, 4, 0, 6},
			              {7,8,9,10,11,12}};
			              
        int[][] expected = new int[][]{{0,0,0, 0, 0, 0},
        				               {7,8,9,10, 0,12}};
        Assert.assertArrayEquals(expected, Q8.zerofy(src));								  
	}
	
	
	//Zerofy marking rows and columns
	@Test
	public void testZerofy1by1_2() {
		int[][] src = new int[][] { { 0 } };
		Assert.assertArrayEquals(src, Q8.zerofy2(src));
		
		 src = new int[][] { { 1 } };
		Assert.assertArrayEquals(src, Q8.zerofy2(src));
	}
	
	@Test
	public void testZerofy2by2_2() {
		int[][] src = new int[][] {{ 1, 2 }, 
								   { 3, 4 }};
		Assert.assertArrayEquals(src, Q8.zerofy2(src));
		
		src = new int[][] {{ 1, 0 }, 
						   { 3, 4 }};
		int[][] expected = new int[][] {{ 0, 0 }, 
								 		{ 3, 0 }};
		Assert.assertArrayEquals(expected, Q8.zerofy2(src));
	}

	@Test
	public void testZerofy3by3_2() {
		int[][] src = new int[][] {{ 1, 2, 3 }, 
								   { 4, 5, 6 }, 
								   { 7, 8, 9 } };
		Assert.assertArrayEquals(src, Q8.zerofy2(src));
		
		src = new int[][] {{ 1, 2, 3 }, 
						   { 4, 0, 6 }, 
						   { 7, 8, 9 }};
			
		int[][] expected = new int[][] {{ 1, 0, 3 }, 
			     				        { 0, 0, 0 }, 
			     				        { 7, 0, 9 }};
	    Assert.assertArrayEquals(expected, Q8.zerofy2(src));

	}

	@Test
	public void testZerofy4by4_2() {
		int[][] src = new int[][] {{ 1,   2,  3,  4 }, 
								   { 5,   6,  7,  8 }, 
								   { 9,  10, 11, 12 }, 
								   { 13, 14, 15, 16 }};
		
		Assert.assertArrayEquals(src, Q8.zerofy2(src));
		
		
		src = new int[][] {{ 1,   2,  3,  4 }, 
						   { 5,   0,  7,  8 }, 
						   { 9,   0, 11, 12 }, 
						   { 13, 14, 15, 16 }};
			
		int [][] expected = new int[][] {{  1, 0,  3,  4 }, 
			     				 		 {  0, 0,  0,  0 }, 
			     				 		 {  0, 0,  0,  0 }, 
			     				 		 { 13, 0, 15, 16 }};

	     Assert.assertArrayEquals(expected, Q8.zerofy2(src));
	}
	
	@Test
	public void testZerofy5by5_2() {
		int[][] src = new int[][] {{ 1,   2,  3,  4 ,  5}, 
								   { 6,   7,  8,  9 , 10}, 
								   { 11, 12, 13,  14, 15}, 
								   { 16, 17, 18, 19 , 20}, 
								   { 21, 22, 23, 24 , 25}};

		Assert.assertArrayEquals(src, Q8.zerofy2(src));
		
		src = new int[][] {{  0,  2,  3,  4 ,  5}, 
			   			   {  6,  7,  8,  9 , 10}, 
			   			   { 11, 12,  0,  14, 15}, 
			   			   { 16, 17, 18, 19 , 20}, 
			   			   { 21, 22, 23, 24 ,  0}};
		
		int[][] expected = new int[][] {{ 0,  0, 0,  0 , 0}, 
									    { 0,  7, 0,  9 , 0}, 
										{ 0,  0, 0,  0 , 0}, 
										{ 0, 17, 0, 19 , 0}, 
										{ 0,  0, 0,  0 , 0}};

		Assert.assertArrayEquals(expected, Q8.zerofy2(src));
	}
	
	@Test 
	public void testZerofy2by6_2(){
		int[][] src = new int[][]{{1,2,3, 4, 5, 6},
								  {7,8,9,10,11,12}};
								  
		Assert.assertArrayEquals(src, Q8.zerofy2(src));
		
		src = new int[][]{{1,2,3, 4, 0, 6},
			              {7,8,9,10,11,12}};
			              
        int[][] expected = new int[][]{{0,0,0, 0, 0, 0},
        				               {7,8,9,10, 0,12}};
        Assert.assertArrayEquals(expected, Q8.zerofy2(src));								  
	}
	
	// book
		@Test
		public void testZerofy1by1_3() {
			int[][] src = new int[][] { { 0 } };
			Assert.assertArrayEquals(src, Q8.setZeros(src));
			
			 src = new int[][] { { 1 } };
			Assert.assertArrayEquals(src, Q8.setZeros(src));
		}
		
		@Test
		public void testZerofy2by2_3() {
			int[][] src = new int[][] {{ 1, 2 }, 
									   { 3, 4 }};
			Assert.assertArrayEquals(src, Q8.setZeros(src));
			
			src = new int[][] {{ 1, 0 }, 
							   { 3, 4 }};
			int[][] expected = new int[][] {{ 0, 0 }, 
									 		{ 3, 0 }};
			Assert.assertArrayEquals(expected, Q8.setZeros(src));
		}

		@Test
		public void testZerofy3by3_3() {
			int[][] src = new int[][] {{ 1, 2, 3 }, 
									   { 4, 5, 6 }, 
									   { 7, 8, 9 } };
			Assert.assertArrayEquals(src, Q8.setZeros(src));
			
			src = new int[][] {{ 1, 2, 3 }, 
							   { 4, 0, 6 }, 
							   { 7, 8, 9 }};
				
			int[][] expected = new int[][] {{ 1, 0, 3 }, 
				     				        { 0, 0, 0 }, 
				     				        { 7, 0, 9 }};
		    Assert.assertArrayEquals(expected, Q8.setZeros(src));

		}

		@Test
		public void testZerofy4by4_3() {
			int[][] src = new int[][] {{ 1,   2,  3,  4 }, 
									   { 5,   6,  7,  8 }, 
									   { 9,  10, 11, 12 }, 
									   { 13, 14, 15, 16 }};
			
			Assert.assertArrayEquals(src, Q8.setZeros(src));
			
			
			src = new int[][] {{ 1,   2,  3,  4 }, 
							   { 5,   0,  7,  8 }, 
							   { 9,   0, 11, 12 }, 
							   { 13, 14, 15, 16 }};
				
			int [][] expected = new int[][] {{  1, 0,  3,  4 }, 
				     				 		 {  0, 0,  0,  0 }, 
				     				 		 {  0, 0,  0,  0 }, 
				     				 		 { 13, 0, 15, 16 }};

		     Assert.assertArrayEquals(expected, Q8.setZeros(src));
		}
		
		@Test
		public void testZerofy5by5_3() {
			int[][] src = new int[][] {{ 1,   2,  3,  4 ,  5}, 
									   { 6,   7,  8,  9 , 10}, 
									   { 11, 12, 13,  14, 15}, 
									   { 16, 17, 18, 19 , 20}, 
									   { 21, 22, 23, 24 , 25}};

			Assert.assertArrayEquals(src, Q8.setZeros(src));
			
			src = new int[][] {{  0,  2,  3,  4 ,  5}, 
				   			   {  6,  7,  8,  9 , 10}, 
				   			   { 11, 12,  0,  14, 15}, 
				   			   { 16, 17, 18, 19 , 20}, 
				   			   { 21, 22, 23, 24 ,  0}};
			
			int[][] expected = new int[][] {{ 0,  0, 0,  0 , 0}, 
										    { 0,  7, 0,  9 , 0}, 
											{ 0,  0, 0,  0 , 0}, 
											{ 0, 17, 0, 19 , 0}, 
											{ 0,  0, 0,  0 , 0}};

			Assert.assertArrayEquals(expected, Q8.setZeros(src));
		}
		
		@Test 
		public void testZerofy2by6_3(){
			int[][] src = new int[][]{{1,2,3, 4, 5, 6},
									  {7,8,9,10,11,12}};
									  
			Assert.assertArrayEquals(src, Q8.setZeros(src));
			
			src = new int[][]{{1,2,3, 4, 0, 6},
				              {7,8,9,10,11,12}};
				              
	        int[][] expected = new int[][]{{0,0,0, 0, 0, 0},
	        				               {7,8,9,10, 0,12}};
	        Assert.assertArrayEquals(expected, Q8.setZeros(src));								  
		}
}
