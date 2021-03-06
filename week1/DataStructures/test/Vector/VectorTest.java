package Vector;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.JUnit4;
import org.junit.Before;

public class VectorTest {

	 private Vector<Integer> vector;

    @Before
    public void initVector() {
        vector = new Vector<Integer>();
    }
    
    @Test
    public void testInit() {
    	vector.add(1);
    	vector.add(2);
    	vector.add(3);
    	vector.add(4);
    	vector.add(5);
    	vector.add(2);
    	vector.add(2);
    	assertEquals(vector.size(), 7);
    }
    
    @Test
    public void testReallocation(){
    	for (int i = 0; i < 64; i++) {
			vector.add(i);
		}
    	assertEquals(vector.size(), 64);
    	assertEquals(vector.capacity(), 128);
    	for (int i = 0; i < 3; i++) {
			vector.remove(i);
			System.out.println(vector.capacity());
		}
    	assertEquals(vector.size(), 61);

		
    	assertEquals(vector.capacity(), 84);
    }
    
    @Test
    public void testInsert() {
        final int length = 4;
        
        for (int i = 0; i < length; ++i) {
            vector.add(i);
        }
        
        assertEquals(length, vector.size());
        
        vector.insert(1, 6);

        assertEquals(length + 1, vector.size());
        assertEquals(Integer.valueOf(0), vector.get(0));
        assertEquals(Integer.valueOf(6), vector.get(1));
    }
}
