package com.oemv.cci.mycollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList<E> {

	private final static int INITIAL_CAPACITY = 2;

	private final static int FACTOR = 2;

	private Object[] array;

	int index = 0;

	public MyArrayList() {
		array = new Object[INITIAL_CAPACITY];
	}

	public int size() {
		return array.length;
	}

	public void add(E e) {
		ensureCapacity();
		array[index++] = e;
	}

	public E get(int i) {
		if (i < 0 || i > index) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return (E) array[i];
	}

	private void ensureCapacity() {
		if (index == array.length) {
			Object[] old = array;
			int capacity = array.length * FACTOR;
			array = new Object[capacity];
			System.arraycopy(old, 0, array, 0, old.length);
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(array);
	}

	public static void main(String[] args) {
		MyArrayList<String> myArray = new MyArrayList<>();
		myArray.add("A");
		myArray.add("B");
		myArray.add("C");
		myArray.add("D");

		System.out.println(myArray.size());

		System.out.println(myArray.get(2));

		System.out.println(myArray);

		List l = new ArrayList<>();
	}

}
