package com.colabug.linkedlist;

import java.lang.*;

public class LinkedListManager
{
    LinkedList<Integer> ll;
    private String[] arguments;

    LinkedListManager()
    {
        ll = new LinkedList<Integer>();
    }

    public void createLinkedListManager( String argv[] )
    {
        this.arguments = argv;
    }

    public void run()
    {
        if ( arguments.length <= 0 )
        {
            System.out.println( "No nodes to create" );
            return;
        }

        // Process node data
        for ( String argument : arguments )
        {
            System.out.println( "Adding node to front: " + argument );
            ll.addFront( Integer.valueOf( argument ) );
        }

        // Print size
        System.out.println( "Size " + ll.size() );

        // Add first element to back of list
        System.out.println( "Adding node to back: " + arguments[0] );
        ll.addBack( Integer.valueOf( arguments[0] ) );

        // Print size
        System.out.println( "Size " + ll.size() );

        // Print list
        ll.printList();
    }
}
