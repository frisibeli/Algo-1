package Sorting;

public class SelectionSort implements Sorting{
	public int[] sequence;
	SelectionSort(){
		sequence = new int[0];
	}
	SelectionSort(int[] range){
		sequence = range;
		sort(range);
	}
	@Override
	public void sort(int[] sequence) {
		int temp;
		for (int i = 0; i < sequence.length-1; i++) {
			for (int j = i+1; j < sequence.length; j++) {
				if(sequence[i]>sequence[j]){
					temp = sequence[i];
					sequence[i] = sequence[j];
					sequence[j] = temp;
				}
			}
		}
	}

}
