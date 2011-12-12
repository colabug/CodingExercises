package com.colabug.queue;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class QueueTest
{
    static private Queue<Integer> integerQueue;
    static private Integer data = 5;
    static private Integer data2 = 6;

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

    @Test
    public  void testEnqueueTwoElements()
    {
        integerQueue.enqueue( data );
        integerQueue.enqueue( data2 );
        assertTrue( !integerQueue.isEmpty() );
        assertEquals( data, integerQueue.front() );
        assertEquals( data2, integerQueue.back() );
    }
}
