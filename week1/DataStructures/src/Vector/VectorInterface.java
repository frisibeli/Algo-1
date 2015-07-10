package Vector;
public interface VectorInterface<T> {

	// Adds value at a specific index in the Vector.
	// Complexity: O(n)
	public abstract void insert(int index, T value);

	// Adds value to the end of the Vector.
	// Complexity: O(1)
	public abstract void add(T value);

	// Returns value at a specific index in the Vector
	// Complexity: O(1)
	public abstract T get(int index);

	// Removes element at the specific index
	// Complexity: O(n)
	public abstract void remove(int index);

	// Removes element at the last index
	// Complexity: O(1)
	public abstract T pop();

	// Returns the number of elements in the Vector.
	// Complexity: O(1)
	public abstract int size();

	// Returns the total capacity of the Vector.
	// Complexity: O(1)
	public abstract int capacity();

}