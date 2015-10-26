package Sorting;

public class BubbleSort implements Sorting {
	public int[] range;
	
	public BubbleSort(){
		range = new int[0];
	}
	
	public BubbleSort(int[] sequence) {
		range = sequence;
		sort(range);
	}

	@Override
	public void sort(int[] sequence) {
		int temp, n = sequence.length, newn = 0;
		while(n != 0){
			newn = 0;
			for (int i = 0; i < n-1; i++) {
				if(sequence[i]>sequence[i+1]){
					temp = sequence[i];
					sequence[i] = sequence[i+1];
					sequence[i+1] = temp;
					newn = i+1;
				}
				
			}
			n = newn;
		}
		range = sequence;
	}

}
