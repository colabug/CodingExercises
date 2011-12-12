package com.colabug.queue;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class QueueTest
{
    private Queue<Integer> integerQueue;
    static private Integer data = 5;

    @Before
    public void setUp()
    {
        integerQueue = new Queue<Integer>();
    }

    @Test
    public void testEmptyQueue()
    {
        assertTrue( integerQueue.isEmpty() );
    }

    @Test
    public void testEnqueueOneElement()
    {
        integerQueue.enqueue( data );
        assertTrue( !integerQueue.isEmpty() );
        assertEquals( data, integerQueue.front() );
        assertEquals( data, integerQueue.back() );
    }
}
