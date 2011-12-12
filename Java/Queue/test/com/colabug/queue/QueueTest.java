package com.colabug.queue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;

public class QueueTest
{
    static private Queue<Integer> integerQueue;
    static private Integer data  = 5;
    static private Integer data2 = 6;
    static private Integer data3 = 7;
    static private Integer data4 = 8;

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

    @Test
    public void testEnqueueArbitraryNumberElements()
    {
        // Populate queue
        populateArbitraryQueue();

        // Check ends
        confirmFrontAndBackElements( data, data4 );
    }

    @Ignore
    private void populateArbitraryQueue()
    {
        integerQueue.enqueue( data );
        integerQueue.enqueue( data2 );
        integerQueue.enqueue( data3 );
        integerQueue.enqueue( data4 );
    }

    @Test
    public void testDequeueFromEmptyQueue()
    {
        assertNull( integerQueue.dequeue() );
    }

    @Test
    public void testDequeueFromSingleItemQueue()
    {
        // Populate queue & dequeue
        integerQueue.enqueue( data );
        integerQueue.dequeue();

        // Make sure empty
        assertTrue( integerQueue.isEmpty() );
    }

    @Test
    public void testDequeueFromTwoItemQueue()
    {
        // Populate queue & dequeue
        integerQueue.enqueue( data );
        integerQueue.enqueue( data2 );
        integerQueue.dequeue();

        // Verify queue only has one item
        assertTrue( !integerQueue.isEmpty() );
        assertEquals( data2, integerQueue.front() );
        assertEquals( data2, integerQueue.back() );
    }

    @Test
    public void testDequeueFromArbitraryQueue()
    {
        // Populate queue
        populateArbitraryQueue();
        integerQueue.dequeue();
        integerQueue.dequeue();

        // Verify queue contents
        assertTrue( !integerQueue.isEmpty() );
        assertEquals( data3, integerQueue.front() );
        assertEquals( data4, integerQueue.back() );
    }
}
