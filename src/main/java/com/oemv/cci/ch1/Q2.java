package com.oemv.cci.ch1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Q2 {

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
			if (each.getValue() > 0)
				return false;
		}
		return true;
	}

}
