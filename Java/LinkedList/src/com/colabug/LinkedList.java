package com.colabug;

import java.lang.*;

public class LinkedList
{
    private Node head;
    private Node tail;
    private int size = 0;

    public LinkedList()
    {
        head = null;
    }

    public void addFront(int nodeData)
    {
        // Empty list, made node head
        if (isEmpty())
        {
            createNewHeadNode(nodeData);
            return;
        }
        // Populated list
        else
        {
            Node node = new Node(nodeData, head);
            head = node;
        }

        // Increase size
        size++;
    }

    public void addBack(int nodeData)
    {
        // Empty list, made node head
        if (isEmpty())
        {
            createNewHeadNode(nodeData);
            return;
        }

        // Find back of list
        Node currentNode = head;
        for ( ; currentNode.next != null; currentNode = currentNode.next)
        { }

        // Add node to back
        Node node = new Node(nodeData, null);
        currentNode.next = node;
        tail = node;

        // Increase size
        size++;
    }

    private void createNewHeadNode(int nodeData)
    {
        Node node = new Node(nodeData, null);
        head = node;
        tail = head;
        size++;
    }

    public boolean isEmpty()
    {
        if (head == null)
        {
            return true;
        }

        return false;
    }

    public void printList()
    {
        // Cycle through list
        System.out.println("Nodes:");
        for (Node currentNode = head;
            currentNode != null;
            currentNode = currentNode.next)
        {
            System.out.println(currentNode.data);
        }
    }

    public int size()
    {
        return size;
    }

    public Node getHead()
    {
        return head;
    }

    public Node getTail()
    {
        return tail;
    }

    @Override
    public String toString()
    {
        String string = "";

        // Cycle through list
        for (Node currentNode = head;
            currentNode != null;
            currentNode = currentNode.next)
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
        else if (size > 1)
        {
            // Remove node
            Node newHead = head.next;
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
            return;
        }
        // Single item list
        else if ( size == 1 )
        {
            clearMostlyDeadList();
        }
        // Greater than one
        else if (size > 1)
        {
            // Navigate to the node before the tail
            Node newTail = head;
            for ( ; newTail.next != tail;
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

    public void removeAtIndex()
    {
        size--;
    }
}
