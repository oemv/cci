package com.oemv.cci.ch2;

import java.util.Iterator;
import java.util.LinkedList;

public class Q11 {

	public static <E> E getKthToLast(int k, LinkedList<E> list) {
		int size = list.size();
		if (null == list || list.isEmpty() || k >= size) {
			return null;
		}

		int i = 0;
		Iterator<E> it = list.iterator();

		while (it.hasNext()) {
			i++;
			E e = it.next();
			if (i == (size - k)) {
				return e;
			}
		}

		return null;
	}

	public static <E> E getKthToLast_apis(int k, LinkedList<E> list) {
		int size = list.size();
		if (null == list || list.isEmpty() || k >= size) {
			return null;
		}
		return list.get(size - k -1);
	}

	public static String printKthToLast(int i, int k, Iterator<String> it) {
		if (i == k) {
			return (it.next());
		}

		if (it.hasNext()) {
			it.next();
			printKthToLast(i + 1, k, it);
		}
		
		return null;
	}

}
