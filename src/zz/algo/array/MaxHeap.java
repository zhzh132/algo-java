package zz.algo.array;

import java.util.ArrayList;

public class MaxHeap {

	private ArrayList<Integer> array;
	
	public MaxHeap() {
		this.array = new ArrayList<>();
	}
	
	public MaxHeap(int size) {
		this.array = new ArrayList<>(size);
	}
	
	public MaxHeap(int[] arr) {
		this(arr.length);
		for(int val : arr) {
			array.add(val);
		}
		buildMaxHeap();
	}
	
	private void buildMaxHeap() {
		for(int i = array.size() / 2 - 1; i >= 0; i--) {
			maxHeapify(i);
		}
	}
	
	private void maxHeapify(int i) {
		int l = left(i);
		int r = right(i);
		int largest;
		if(l < array.size() && array.get(l) >= array.get(i)) {
			largest = l;
		}
		else {
			largest = i;
		}
		if(r < array.size() && array.get(r) >= array.get(largest)) {
			largest = r;
		}
		if(largest != i) {
			swap(i, largest);
			maxHeapify(largest);
		}
	}
	
	private int left(int i) {
		return (i << 1) + 1;
	}
	
	private Integer right(int i) {
		return (i << 1) + 2;
	}
	
	private void swap(int i, int j) {
		Integer tmp = array.get(i);
		array.set(i, array.get(j));
		array.set(j, tmp);
	}

	public int[] toIntArray() {
		int[] arr = new int[array.size()];
		for(int i = 0; i < array.size(); i++) {
			arr[i] = array.get(i);
		}
		return arr;
	}
}
