package Stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
	private Stack<Integer> stack;
	@Before
	public void setUp() throws Exception {
		stack = new Stack<Integer>();
	}

	@Test
	public void testPush() {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		int a = stack.pop();
		assertEquals(a, 7);
	}
	@Test
	public void testPeek() {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		int a = stack.peek();
		a = stack.peek();
		assertEquals(a, 7);
	}

}
