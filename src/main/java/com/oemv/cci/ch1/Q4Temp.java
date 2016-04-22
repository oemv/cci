package com.oemv.cci.ch1;

public class Q4Temp {

	public static boolean isPermutationOfPalindrome(String phrase) {
		int[] counts = new int[27];
		int oddCount = 0;
		for (char _char : phrase.toCharArray()) {
			int c = map(_char);
			if (c != -1) {
				counts[c]++;
				if ((counts[c] % 2) == 0) {
					oddCount--;
				} else {
					oddCount++;
				}
			}
		}
		return oddCount < 2;
	}

	/**
	 * Maps a character to a number of 1 to 26 (case-insensitive). <br />
	 * a->1, b->2, C->3, D->4
	 * 
	 * @param _char
	 * @return
	 */
	public static int map(char _char) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int $char = Character.getNumericValue(_char);

		if ($char <= z && $char >= a) {
			return $char - a + 1;
		} else {
			return -1;
		}
	}
}
