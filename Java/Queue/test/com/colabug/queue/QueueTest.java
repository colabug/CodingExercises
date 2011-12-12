package com.colabug.queue;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class QueueTest
{
    @Test
    public void testEmptyQueue()
    {
        Queue<Integer> integerQueue = new Queue<Integer>();
        assertTrue( integerQueue.isEmpty() );
    }
}
