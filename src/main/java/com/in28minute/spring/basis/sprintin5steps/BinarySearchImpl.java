package com.in28minute.spring.basis.sprintin5steps;

public class BinarySearchImpl {
	
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(final SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int [] sortedNumbers = sortAlgorithm.sort(numbers);
		return sortedNumbers[0];
	}
}
