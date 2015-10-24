package Sorting;

public class InsertionSort implements Sorting{
	public int[] sequence;
	InsertionSort(){
		sequence = new int[0];
	}
	InsertionSort(int[] range){
		sequence = range;
		sort(range);
	}
	@Override
	public void sort(int[] sequence) {
		for (int i = 1; i < sequence.length; i++) {
			int j = i;
			int temp = sequence[i];
			while(j > 0 && sequence[j-1]>temp){
				sequence[j] = sequence[j-1];
				j--;
			}
			sequence[j] = temp;
		}
	}

}
