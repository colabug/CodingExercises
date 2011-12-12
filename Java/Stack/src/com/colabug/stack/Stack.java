package com.colabug.stack;

import com.colabug.linkedlist.LinkedList;

public class Stack<T>
{
    private final LinkedList<T> linkedList = new LinkedList<T>();

    public boolean isEmpty()
    {
        return true;
    }

    public void push( T data )
    {
        linkedList.addBack( data );
    }
}
