package Sorting;

public class InsertionSort implements Sorting {
	public int[] range;
	public InsertionSort(int[] array){
		range = array;
		sort(range);
	}
	
	public void swap(int[] array, int i,int j){
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	@Override
	public void sort(int[] sequence) {
		for (int i = 2; i < sequence.length; i++) {
			int j = i-1;
			while( j>=0 && sequence[j]>sequence[j+1]){
				swap(sequence, j, j+1);
				--j;
			}
		}
	}

}
