package Queue;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> implements QueueInterface{
	private List<T> container;
	
	Queue(){
		container = new ArrayList<T>();
	}
	Queue(int size, T value){
		container = new ArrayList<T>(size);
		for(int i=0; i<size; i++){
			container.add(value);
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public void push(Object value) {
		container.add((T) value);		
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
