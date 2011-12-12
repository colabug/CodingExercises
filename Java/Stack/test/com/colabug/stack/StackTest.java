package com.colabug.stack;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class StackTest
{
    @Test
    public void testEmptyStack()
    {
        Stack<Integer> stack = new Stack<Integer>();
        assertTrue( stack.isEmpty() );
    }
}
