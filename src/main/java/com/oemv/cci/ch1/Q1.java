package com.oemv.cci.ch1;

import java.util.Arrays;

public class Q1 {

	// My Solution O(n log n)
	static boolean isUnique(String string) {
		char[] chars = string.toCharArray();
		Arrays.sort(chars);
		int i = 0, size = chars.length - 1;
		while (i < size && chars[i] < chars[i + 1])
			i++;
		return i == size;
	}

	// Optimal Solution O(N)
	static boolean isUnique2(String string) {
		int checker = 0;
		for (int i = 0; i < string.length(); i++) {
			int val = string.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}

}
