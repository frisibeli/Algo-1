package Vector;

public class Vector<T> implements VectorInterface<T> {
	public final int INITIAL_SIZE = 8;
	public final int GROWTH_RATE = 2;
	
	private T[] array;
	private int vectorSize;
	private int capacity;
	
	@SuppressWarnings("unchecked")
	Vector(){
		array = (T[]) new Object[INITIAL_SIZE];
		vectorSize = 0;
		capacity = INITIAL_SIZE;
	}
	
	@SuppressWarnings("unchecked")
	Vector(int size, T value){
		array = (T[]) new Object[size];
		vectorSize = size;
		capacity = size;
		for (int i = 0; i < size; i++) {
			array[i] = value;
		}
	}
	
	private void reallocateNewSpace(int space){
		capacity = space;
		T[] temp = (T[]) new Object[capacity];
		for (int i = 0; i < vectorSize; i++) {
			temp[i] = array[i];
		}
		array = temp;
	}
	private static void checkBounaries(int index, int size){
		if(index >= size || index < 0){
			throw new IllegalStateException("Not in boundaries");
		}
	}
	@Override
	public void insert(int index, T value) {
		checkBounaries(index, vectorSize);
		if(vectorSize+1 >= capacity){
			reallocateNewSpace(capacity*GROWTH_RATE);
		}
		T temp = array[index];
		array[index] = value;
		for (int i = index+1; i < vectorSize; i++) {
			array[i] = temp;
			temp = array[i+1];
		}
		vectorSize++;
	}

	@Override
	public void add(T value) {
		if(vectorSize+1 >= capacity){
			reallocateNewSpace(capacity*GROWTH_RATE);
		}
		array[vectorSize] = value;
		vectorSize++;
	}

	@Override
	public T get(int index) {
		checkBounaries(index, vectorSize);
		return array[index];
	}

	@Override
	public void remove(int index) {
		checkBounaries(index, vectorSize);
		if(vectorSize-1 <= capacity()/2){
			reallocateNewSpace((capacity()/3)*2);
		}
		for (int i = index+1; i < vectorSize; i++) {
			array[i] = array[i+1];
		}
		--vectorSize;
	}

	@Override
	public T pop() {
		checkBounaries(vectorSize-1, vectorSize);
		if(vectorSize-1 <= capacity()/2){
			reallocateNewSpace((capacity()/3)*2);
		}
		--vectorSize;
		return array[vectorSize];
	}

	@Override
	public int size() {
		return vectorSize;
	}

	@Override
	public int capacity() {
		return capacity;
	}

}
