package com.colabug.queue;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class QueueTest
{
    private Queue<Integer> integerQueue;

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
}
