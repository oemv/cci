package com.oemv.cci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Q4TestTemp {

	@Test
	public void testMapCharacter() {
		Assert.assertTrue(Q4Temp.map('a') == 1);
		Assert.assertTrue(Q4Temp.map('b') == 2);
		Assert.assertTrue(Q4Temp.map('z') == 26);

		Assert.assertTrue(Q4Temp.map('A') == 1);
		Assert.assertTrue(Q4Temp.map('Z') == 26);
	}

	@Test
	public void testToggleBit() {
		int vector = 0;
		int toggled = Q4Temp.toggle(vector, 'c');
		Assert.assertEquals("1000", Integer.toBinaryString(toggled));
		Assert.assertTrue(0 == Q4Temp.toggle(toggled, 'c'));
	}

	@Test
	public void testIsPermutationOfPalindrome() {
		Assert.assertTrue(Q4Temp.isPermutationOfPalindrome("Coa Coa"));
		Assert.assertTrue(Q4Temp.isPermutationOfPalindrome("x"));
		Assert.assertTrue(Q4Temp.isPermutationOfPalindrome("xx"));
		Assert.assertTrue(Q4Temp.isPermutationOfPalindrome("Anita lava LA tina"));
	}

	@Test
	public void testIsNotPermutationOfPalindrome() {
		Assert.assertFalse(Q4Temp.isPermutationOfPalindrome("Tacos"));
		Assert.assertFalse(Q4Temp.isPermutationOfPalindrome("Godzilla"));
		Assert.assertFalse(Q4Temp.isPermutationOfPalindrome("Banana"));
	}

	@Test
	public void testIsPermutationOfPalindrome2() {
		Assert.assertTrue(Q4Temp.isPermutationOfPalindrome2("Coa Coa"));
		Assert.assertTrue(Q4Temp.isPermutationOfPalindrome2("x"));
		Assert.assertTrue(Q4Temp.isPermutationOfPalindrome2("xx"));
		Assert.assertTrue(Q4Temp.isPermutationOfPalindrome2("Anita lava LA tina"));
	}

	@Test
	public void testIsNotPermutationOfPalindrome2() {
		Assert.assertFalse(Q4Temp.isPermutationOfPalindrome2("Tacos"));
		Assert.assertFalse(Q4Temp.isPermutationOfPalindrome2("Godzilla"));
		Assert.assertFalse(Q4Temp.isPermutationOfPalindrome2("Banana"));
	}

}
