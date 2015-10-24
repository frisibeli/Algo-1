package Sorting;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SortingTest {
	private int[] exampleInput = {4,13,52,7,18,3,1,6};
	private int[] exampleOutput = {1,3,4,6,7,13,18,52};

	@Test
	public void testSelectionSort() {
		SelectionSort sorter = new SelectionSort(exampleInput);
		assertEquals(Arrays.equals(sorter.sequence, exampleOutput), true);
	}
	@Test
	public void testInsertionSort() {
		InsertionSort sorter = new InsertionSort(exampleInput);
		assertEquals(Arrays.equals(sorter.sequence, exampleOutput), true);
	}
	//Arrays.equals(Arrays.sort(arr1), Arrays.sort(arr2))
}
