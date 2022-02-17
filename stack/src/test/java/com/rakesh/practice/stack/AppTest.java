package com.rakesh.practice.stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rakesh.practice.stack.impl.GenericArrayStackImpl;
import com.rakesh.practice.stack.interfaces.BaseStackOperations;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void size() {
		BaseStackOperations<Integer> myStack = new GenericArrayStackImpl<Integer>();

        assertTrue(myStack.size() == 0);

        myStack.push(1);
        myStack.push(3);
        myStack.push(5);
        assertEquals(3, myStack.size());
    }
    
    @Test
    public void isEmpty() {
    	BaseStackOperations<Integer> newStack = new GenericArrayStackImpl<Integer>();
        assertTrue(newStack.isEmpty());

        newStack.push(2);
        assertFalse(newStack.isEmpty());

        newStack.pop();
        assertTrue(newStack.isEmpty());
    }

}
