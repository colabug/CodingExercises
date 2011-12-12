package com.colabug.stack;

import com.colabug.linkedlist.LinkedList;

public class Stack<T>
{
    private final LinkedList<T> linkedList = new LinkedList<T>();

    public boolean isEmpty()
    {
        return linkedList.isEmpty();
    }

    public void push( T data )
    {
        linkedList.addBack( data );
    }

    public T pop()
    {
        T data = linkedList.getTail();
        linkedList.removeTail();
        return data;
    }

    public T top()
    {
        return linkedList.getTail();
    }
}
