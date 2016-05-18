package com.oemv.cci.ch2;

import static java.util.Arrays.asList;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class Q11Test {

	@Test
	public void testPostToEnd1() {
		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
		String result = Q11.getKthToLast(1, list);
		Assert.assertEquals("E", result);
	}

	@Test
	public void testPostToEnd2() {
		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
		String result = Q11.getKthToLast(5, list);
		Assert.assertEquals("A", result);
	}

	@Test
	public void testFinalAlready() {
		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
		String result = Q11.getKthToLast(0, list);
		Assert.assertEquals("F", result);
	}

	@Test
	public void testNotFound() {
		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
		String result = Q11.getKthToLast(10, list);
		Assert.assertEquals(null, result);
	}

	@Test
	public void testPostToEnd1_apis() {
		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
		String result = Q11.getKthToLast_apis(1, list);
		Assert.assertEquals("E", result);
	}

	@Test
	public void testPostToEnd2_apis() {
		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
		String result = Q11.getKthToLast_apis(5, list);
		Assert.assertEquals("A", result);
	}

	@Test
	public void testFinalAlready_apis() {
		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
		String result = Q11.getKthToLast_apis(0, list);
		Assert.assertEquals("F", result);
	}

	@Test
	public void testNotFound_apis() {
		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
		String result = Q11.getKthToLast_apis(10, list);
		Assert.assertEquals(null, result);
	}
	
	@Test
	public void testPostToEnd1_recusion() {
		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
		String result = Q11.printKthToLast(1, list.size()-1, list.iterator());
		Assert.assertEquals("E", result);
	}

//	@Test
//	public void testPostToEnd2_recusion() {
//		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
//		String result = Q11.printKthToLast(1,5, list);
//		Assert.assertEquals("A", result);
//	}
//
//	@Test
//	public void testFinalAlready_recusion() {
//		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
//		String result = Q11.printKthToLast(0, list);
//		Assert.assertEquals("F", result);
//	}
//
//	@Test
//	public void testNotFound_recusion() {
//		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
//		String result = Q11.printKthToLast(10, list);
//		Assert.assertEquals(null, result);
//	}

}
