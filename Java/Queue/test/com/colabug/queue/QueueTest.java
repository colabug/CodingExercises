package com.colabug.queue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class QueueTest
{
    static private Queue<Integer> integerQueue;
    static private Integer data  = 5;
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
        // Populate queue
        integerQueue.enqueue( data );

        // Check ends
        confirmFrontAndBackElements( data, data );
    }

    @Ignore
    private void confirmFrontAndBackElements( Integer front, Integer back )
    {
        assertTrue( !integerQueue.isEmpty() );
        assertEquals( front, integerQueue.front() );
        assertEquals( back, integerQueue.back() );
    }

    @Test
    public void testEnqueueTwoElements()
    {
        // Populate queue
        integerQueue.enqueue( data );
        integerQueue.enqueue( data2 );

        // Check ends
        confirmFrontAndBackElements( data, data2 );
    }
}
