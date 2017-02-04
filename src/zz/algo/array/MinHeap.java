package zz.algo.array;

import java.util.ArrayList;

public class MinHeap {

	private ArrayList<Integer> array;
	
	public MinHeap() {
		this.array = new ArrayList<>();
	}
	
	public MinHeap(int size) {
		this.array = new ArrayList<>(size);
	}
	
	public MinHeap(int[] arr) {
		this(arr.length);
		for(int val : arr) {
			array.add(val);
		}
		buildMinHeap();
	}
	
	private void buildMinHeap() {
		for(int i = array.size() / 2 - 1; i >= 0; i--) {
			minHeapify(i);
		}
	}
	
	private void minHeapify(int i) {
		int l = left(i);
		int r = right(i);
		int smallest;
		if(l < array.size() && array.get(l) <= array.get(i)) {
			smallest = l;
		}
		else {
			smallest = i;
		}
		if(r < array.size() && array.get(r) <= array.get(smallest)) {
			smallest = r;
		}
		if(smallest != i) {
			swap(i, smallest);
			minHeapify(smallest);
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
