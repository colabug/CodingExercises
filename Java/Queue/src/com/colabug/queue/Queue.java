package com.colabug.queue;

import com.colabug.linkedlist.LinkedList;

public class Queue<T>
{
    private final LinkedList<T> linkedList = new LinkedList<T>();

    public boolean isEmpty()
    {
        return linkedList.isEmpty();
    }

    public void enqueue( T data )
    {
        linkedList.addBack( data );
    }

    public T front()
    {
        return linkedList.getHead();
    }

    public T back()
    {
        return linkedList.getTail();
    }

    public T dequeue()
    {
        T data = linkedList.getHead();
        linkedList.removeHead();
        return data;
    }
}
