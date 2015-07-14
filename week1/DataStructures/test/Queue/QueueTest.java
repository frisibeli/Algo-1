package Queue;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QueueTest {
	private Queue<Integer> queue;

	@Before
	public void setUp() throws Exception {
		queue = new Queue<Integer>();
	}

	@Test
    public void testPush() {
        assertEquals(0, queue.size());
        
        queue.push(1);
        assertEquals(1, queue.size());

        queue.push(1);
        assertEquals(2, queue.size());
    }
    
    @Test
    public void testPop() {
        int count = 3;
        
        for (int i = 0; i < count; i++) {
            queue.push(i);
        }
        for (int i = 0; i< count; i++){
        	assertEquals(i, queue.pop());
        }
    }

}
