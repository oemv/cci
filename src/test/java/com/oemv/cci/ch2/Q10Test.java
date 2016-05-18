package com.oemv.cci.ch2;

import static java.util.Arrays.asList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class Q10Test {

	@Test
	public void testRemoveDups() {
		LinkedList<String> original = new LinkedList<String>(asList(new String[] { "A", "B", "C", "A", "B", "Z" }));
		Set<String> uniques = new HashSet<>(original);
		LinkedList<String> result = Q10.removeDups(original);
		Assert.assertEquals(uniques, new HashSet<>(result));
	}

	@Test
	public void testRemoveDups2() {
		LinkedList<String> original = new LinkedList<String>(asList(new String[] { "A", "A", "A", "A" }));
		Set<String> uniques = new HashSet<>(original);
		LinkedList<String> result = Q10.removeDups(original);
		Assert.assertEquals(uniques, new HashSet<>(result));
	}

	@Test
	public void testNoDupsRemoved() {
		LinkedList<String> original = new LinkedList<String>(asList(new String[] { "A", "B", "C" }));
		LinkedList<String> result = Q10.removeDups(original);
		Assert.assertEquals(original, result);
	}
	
	@Test
	public void testRemoveDups_hashset() {
		LinkedList<String> original = new LinkedList<String>(asList(new String[] { "A", "B", "C", "A", "B", "Z" }));
		Set<String> uniques = new HashSet<>(original);
		LinkedList<String> result = Q10.removeDups_hashset(original);
		Assert.assertEquals(uniques, new HashSet<>(result));
	}

	@Test
	public void testRemoveDups2_hashset() {
		LinkedList<String> original = new LinkedList<String>(asList(new String[] { "A", "A", "A", "A" }));
		Set<String> uniques = new HashSet<>(original);
		LinkedList<String> result = Q10.removeDups_hashset(original);
		Assert.assertEquals(uniques, new HashSet<>(result));
	}

	@Test
	public void testNoDupsRemoved_hashset() {
		LinkedList<String> original = new LinkedList<String>(asList(new String[] { "A", "B", "C" }));
		LinkedList<String> result = Q10.removeDups_hashset(original);
		Assert.assertEquals(original, result);
	}
}
