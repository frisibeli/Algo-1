package Queue;

interface QueueInterface<T> {

	// Adds value to the end of the Queue.
	// Complexity: O(1)
	public abstract void push(T value);

	// Returns value from the front of the Queue and removes it.
	// Complexity: O(1)
	public abstract T pop();

	// Returns value from the front of the Queue without removing it.
	// Complexity: O(1)
	public abstract T peek();

	// Returns the number of elements in the Queue.
	// Complexity: O(1)
	public abstract int size();


}