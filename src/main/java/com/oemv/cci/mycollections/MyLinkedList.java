package com.oemv.cci.mycollections;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyLinkedList<E> {

	private class Node<V> {
		private V v;
		private Node<V> next;
		private Node<V> prev;

		public Node(V v, Node<V> previous, Node<V> next) {
			this.v = v;
			this.prev = previous;
			this.next = next;
		}
	}

	private Node<E> head = new Node<>(null, null, null);
	private int size = 0;

	public MyLinkedList() {
		head.next = head.prev = head;
	}

	public void add(E e) {
		if (size == 0) {
			head.v = e;
		} else {
			Node<E> node = new Node<E>(e, head, head.prev);
			head.prev.next = head.prev = node;
		}
		size++;
	}

	public void add(int i, E e) {
		List<String> list = new LinkedList<String>();
		// if (i > size) {
		// throw new ArrayIndexOutOfBoundsException(i);
		// }
		// int c = 0;
		// Node<E> n = head;
		// Node<E> newNode = new Node<>(e);
		// while (i > c++) {
		// n = n.next;
		// }
		//
		//
		// newNode.next = n.;
		// n.next = newNode;
		// n.next = newNode;

	}

	public void remove(int i) {
	}

	public void remove(E e) {
	}

	public E getFirst() {
		if (size == 0)
			throw new NoSuchElementException();
		return head.v;
	}

	public E getLast() {
		if (size == 0)
			throw new NoSuchElementException();
		return head.prev.v;
	}

}
