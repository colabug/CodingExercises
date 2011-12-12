package com.colabug.stack;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class StackTest
{
    private Stack<Integer> stack;
    private static Integer nodeData;

    @Before
    public void setUp()
    {
        stack = new Stack<Integer>();
        nodeData = 5;
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
    }
}
