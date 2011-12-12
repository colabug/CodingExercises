package com.colabug.stack;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class StackTest
{
    private Stack<Integer> stack;
    private static Integer nodeData = 5;

    @Before
    public void setUp()
    {
        stack = new Stack<Integer>();
    }

    @Test
    public void testEmptyStack()
    {
        assertTrue( stack.isEmpty() );
    }

    @Test
    public void testPush()
    {
        stack.push( nodeData );
        assertFalse( stack.isEmpty() );
        assertEquals( nodeData, stack.top() );
    }
}
