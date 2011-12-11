package com.colabug;

import java.lang.*;

public class LinkedListManager
{
    LinkedList ll;
    private String[] arguments;

    LinkedListManager()
    {
        ll = new LinkedList();
    }

    public void createLinkedListManager(String argv[])
    {
        this.arguments = argv;
    }

    public void run()
    {
        if (arguments.length <= 0)
        {
            System.out.println("No nodes to create");
            return;
        }

        // Process node data
        for (int i = 0; i < arguments.length; i++)
        {
            System.out.println("Creating node! Position = " + i);
            ll.addFront(Integer.valueOf(arguments[i]));
        }

        // Print size
        System.out.println("Size " + ll.size());

        // Add first element to back of list
        System.out.println("Adding node to back of list.");
        ll.addBack(Integer.valueOf(arguments[0]));

        // Print size
        System.out.println("Size " + ll.size());

        // Print list
        ll.printList();
    }
}
