package com.peerds.array;

import java.util.Arrays;

public class DSArrayList<T>{

	private T[] arr;
	private int maxSize;
	private int count;

	public DSArrayList() {
		this.maxSize = 5;
		this.arr = (T[]) new Object[this.maxSize];
		this.count = 0;
	}

	public int size() {
		return this.count;
	}

	public void add(T data) {

		if (this.count == this.maxSize) {
			this.maxSize = this.maxSize * 2;
			T[] tempArr = (T[]) new Object[this.maxSize];

			for (int i = 0; i < this.count; i++) {
				tempArr[i] = this.arr[i];
			}
			this.arr = tempArr;
		}

		this.arr[this.count] = data;
		this.count++;

	}

	public T remove(int index) {
		T data = this.arr[index];

		T[] tempArr = (T[]) new Object[this.maxSize];

		for (int i = 0, j = 0; i < this.count; i++, j++) {
			tempArr[j] = i != index ? this.arr[i] : this.arr[++i];
		}

		this.count--;
		this.arr = tempArr;
		return data;
	}

	@Override
	public String toString() {
		T[] tempArr = (T[]) new Object[this.count];
		for (int i = 0; i < this.count; i++) {
			tempArr[i] = this.arr[i];
		}
		return Arrays.toString(tempArr);
	}

}
