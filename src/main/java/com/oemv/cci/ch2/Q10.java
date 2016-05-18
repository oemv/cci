package com.oemv.cci.ch2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class Q10 {

	// O(N^2)
	public static <T> LinkedList<T> removeDups(LinkedList<T> src) {
		for (int i = 0; i < src.size() - 1; i++) {
			T t = src.get(i);
			for (int j = i + 1; j < src.size();) {
				if (t.equals(src.get(j))) {
					src.remove(j);
				} else {
					j++;
				}
			}
		}
		return src;
	}

	// O(N)- Single iteration, uses extra space
	public static <T> LinkedList<T> removeDups_hashset(LinkedList<T> src) {
		LinkedList<T> copy = new LinkedList<>(src);
		Iterator<T> it = copy.iterator();
		Set<T> set = new HashSet<>();
		while (it.hasNext()) {
			T t = it.next();
			if (set.contains(t)) {
				it.remove();
			} else {
				set.add(t);
			}
		}
		return src;
	}
}
