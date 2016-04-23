package com.oemv.cci.ch1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Q2 {

	// Solution using data structures( Optimizable using arrays)
	public static boolean isPermutation(String a, String b) {

		if (b.length() != a.length()) {
			return false;
		}

		if (b.equals(a)) {
			return true;
		}

		Map<Character, Integer> source = new HashMap<>();
		for (int i = 0; i < a.length(); i++) {
			source.compute(a.charAt(i), (k, v) -> {
				return (null == v) ? 1 : ++v;
			});
		}

		for (int i = 0; i < b.length(); i++) {
			Integer reps = source.get(b.charAt(i));
			if (null == reps) {
				return false;
			} else {
				source.put(b.charAt(i), --reps);
			}
		}

		for (Entry<Character, Integer> each : source.entrySet()) {
			if (each.getValue() > 0) {
				return false;
			}
		}
		return true;
	}

	// Using arrays
	public static boolean isPermutationArray(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}

		if (a.equals(b)) {
			return true;
		}

		int[] letters = new int[128]; // assuming ASCII 7 bits charset

		char[] s_array = a.toCharArray();
		for (char c : s_array) {
			letters[c]++;
		}

		for (int i = 0; i < b.length(); i++) {
			int c = b.charAt(i);
			letters[c]--;
			if (letters[c] < 0) {
				return false;
			}
		}

		return true;
	}

}
