package Stack;
import Queue.Queue;

public class Stack<T> implements StackInterface<T>{
	private Queue<T> stack;
	Stack(){
		stack = new Queue<T>();
	}
	@Override
	public void push(T value) {
		stack.push(value);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pop() {
		Queue<T> tempQueue = new Queue<T>();
		while(stack.size()-1 > 0) {
			tempQueue.push(stack.pop());
		}
		T val = (T) stack.pop();
		stack = tempQueue;
		
		return val;
	}

	@SuppressWarnings({ "unchecked", "unused" })
	@Override
	public T peek() {
		Queue<T> tempQueue = new Queue<T>();
		T val = null;
		while(stack.size() > 0) {
			val = (T) stack.peek();
			tempQueue.push(stack.pop());
		}
		stack = tempQueue;
		return val;
	}

	@Override
	public int size() {
		return stack.size();
	}

}
