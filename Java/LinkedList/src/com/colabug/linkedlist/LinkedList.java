package com.colabug.linkedlist;

import java.lang.*;

public class LinkedList<T>
{
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public LinkedList()
    {
        head = null;
    }

    public void addFront( T nodeData )
    {
        // Empty list, made node head
        if ( isEmpty() )
        {
            createNewHeadNode( nodeData );
            return;
        }
        // Populated list
        else
        {
            head = new Node<T>( nodeData, head );
        }

        // Increase size
        size++;
    }

    public void addBack( T nodeData )
    {
        // Empty list, made node head
        if ( isEmpty() )
        {
            createNewHeadNode( nodeData );
            return;
        }

        // Find back of list
        Node currentNode = head;
        for (; currentNode.next != null; currentNode = currentNode.next )
        {
        }

        // Add node to back
        Node<T> node = new Node<T>( nodeData, null );
        currentNode.next = node;
        tail = node;

        // Increase size
        size++;
    }

    private void createNewHeadNode( T nodeData )
    {
        head = new Node<T>( nodeData, null );
        tail = head;
        size++;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public void printList()
    {
        // Cycle through list
        System.out.println( "Nodes:" );
        for ( Node currentNode = head;
              currentNode != null;
              currentNode = currentNode.next )
        {
            System.out.println( currentNode.data );
        }
    }

    public int size()
    {
        return size;
    }

    public T getHead()
    {
        if ( head == null )
        {
            return null;
        }

        return head.data;
    }

    public T getTail()
    {
        if ( tail == null )
        {
            return null;
        }
        return tail.data;
    }

    @Override
    public String toString()
    {
        String string = "";

        // Cycle through list
        for ( Node currentNode = head;
              currentNode != null;
              currentNode = currentNode.next )
        {
            string += currentNode.data + " ";
        }

        return string.trim();
    }

    public void removeHead()
    {
        // Empty list
        if ( size == 0 )
        {
        }
        // Single item list
        else if ( size == 1 )
        {
            clearMostlyDeadList();
        }
        // Greater than one
        else if ( size > 1 )
        {
            // Remove node
            Node<T> newHead = head.next;
            head.next = null;
            head = newHead;

            // Update size
            size--;
        }
        // Something bad happened
        else
        {
            throw new IllegalStateException( "Error with size of list: " + size );
        }
    }

    public void removeTail()
    {
        if ( size == 0 )
        {
        }
        // Single item list
        else if ( size == 1 )
        {
            clearMostlyDeadList();
        }
        // Greater than one
        else if ( size > 1 )
        {
            // Navigate to the node before the tail
            Node<T> newTail = head;
            for (; newTail.next != tail;
                 newTail = newTail.next )
            {
            }

            // Set new tail
            newTail.next = null;
            tail = newTail;

            // Update size
            size--;
        }
        // Something bad happened
        else
        {
            throw new IllegalStateException( "Error with size of list: " + size );
        }
    }

    private void clearMostlyDeadList()
    {
        head.next = null;
        head = tail = null;
        size = 0;
    }

    public void removeAtIndex( int index )
    {
        if ( index >= size || index < 0 )
        {
            throw new IndexOutOfBoundsException( "Index " + index + " is outside the bounds of the list. List size = " + size );
        }

        // Remove head
        if ( index == 0 )
        {
            removeHead();
        }
        // Remove tail
        else if ( index == size - 1 )
        {
            removeTail();
        }
        // General case
        else
        {
            // Navigate to index
            int count = 0;
            Node currentNode = head;
            Node previousNode = head;
            for (; count < index; count++,
                 previousNode = currentNode,
                 currentNode = currentNode.next )
            {
            }

            // Remove current node
            previousNode.next = currentNode.next;
            currentNode.next = null;
            size--;
        }
    }

    public void clear()
    {
        // Traverse list & remove elements
        Node previousNode = head;
        Node currentNode = head;
        for (;
             currentNode != null;
             previousNode = currentNode, currentNode = currentNode.next )
        {
            previousNode.next = null;
        }

        // Clear other data
        head = tail = null;
        size = 0;
    }
}
