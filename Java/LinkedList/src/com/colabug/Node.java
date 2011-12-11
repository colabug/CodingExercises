package com.colabug;

public class Node<T>
{
    public T    data;
    public Node next;

    Node( T data, Node next )
    {
        this.data = data;
        this.next = next;
    }
}
