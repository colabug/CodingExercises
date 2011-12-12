package com.colabug.queue;

import java.util.LinkedList;

public class Queue<T>
{
    private final LinkedList<T> linkedList = new LinkedList<T>();

    public boolean isEmpty()
    {
        return linkedList.isEmpty();
    }
}
