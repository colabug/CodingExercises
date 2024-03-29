package com.colabug.linkedlist;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.*;

public class IntLinkedListTest
{
    private LinkedList<Integer> ll;
    private static Integer nodeData  = 4;
    private static Integer nodeData2 = 17;
    private static Integer nodeData3 = 2;
    private static Integer nodeData4 = 3;

    @Before
    public void setUp()
    {
        // Create empty linked list
        ll = new LinkedList<Integer>();
    }

    @Test
    public void newListIsEmpty()
    {
        confirmListIsEmpty();
    }

    @Ignore
    private void confirmListIsEmpty()
    {
        confirmSize( 0 );
        assertNull( ll.getHead() );
        assertNull( ll.getTail() );
    }

    @Test
    public void testAddFront()
    {
        // Add element & confirm size
        ll.addFront( nodeData );
        confirmSize( 1 );

        // Confirm element is at front and tail of list
        assertEquals( nodeData, ll.getHead() );
        assertEquals( nodeData, ll.getTail() );
    }

    @Ignore
    private void confirmSize( int expectedSize )
    {
        if ( expectedSize == 0 )
        {
            assertTrue( ll.isEmpty() );
        }
        else if (expectedSize < 0 )
        {
            throw new IllegalStateException( "List can't have a negative size" );
        }
        else
        {
            assertTrue( !ll.isEmpty() );
        }

        assertEquals( expectedSize, ll.size() );
    }

    @Test
    public void testAdd2ElementsToFront()
    {
        // Add elements and confirm size
        ll.addFront( nodeData );
        ll.addFront( nodeData2 );
        confirmSize( 2 );

        // Confirm second element added is the head
        assertEquals( nodeData2, ll.getHead() );

        // Confirm first element added is the tail
        assertEquals( nodeData, ll.getTail() );
    }

    @Test
    public void testAdd3ElementsToFront()
    {
        // Add elements and confirm size
        ll.addFront( nodeData );
        ll.addFront( nodeData2 );
        ll.addFront( nodeData3 );
        confirmSize( 3 );

        // Confirm third element added is the head
        assertEquals( nodeData3, ll.getHead() );

        // Confirm first element added is the tail
        assertEquals( nodeData, ll.getTail() );
    }

    @Test
    public void testToStringFromAddingFront()
    {
        // Add elements and confirm size
        ll.addFront( nodeData );
        ll.addFront( nodeData2 );
        ll.addFront( nodeData3 );
        ll.addFront( nodeData4 );
        confirmSize( 4 );

        // Confirm string is correct
        String expectedString = generateBackwardsString();
        assertEquals( expectedString, ll.toString() );
    }

    private String generateBackwardsString()
    {
        return nodeData4 + " " + nodeData3 + " " + nodeData2 + " " + nodeData;
    }

    @Test
    public void testAddBack()
    {
        // Add element and confirm size
        ll.addBack( nodeData );
        confirmSize( 1 );

        // Confirm element is head and tail
        assertEquals( nodeData, ll.getHead() );
        assertEquals( nodeData, ll.getTail() );
    }

    @Test
    public void testAdd2ElementsToBack()
    {
        // Add elements and confirm size
        ll.addBack( nodeData );
        ll.addBack( nodeData2 );
        confirmSize( 2 );

        // Confirm first element added is the head
        assertEquals( nodeData, ll.getHead() );

        // Confirm last element added is the tail
        assertEquals( nodeData2, ll.getTail() );
    }

    @Test
    public void testAdd3ElementsToBack()
    {
        // Add elements and confirm size
        ll.addBack( nodeData );
        ll.addBack( nodeData2 );
        ll.addBack( nodeData3 );
        confirmSize( 3 );

        // Confirm first element added is the head
        assertEquals( nodeData, ll.getHead() );

        // Confirm last element added is the tail
        assertEquals( nodeData3, ll.getTail() );
    }

    @Test
    public void testToStringFromAddingBack()
    {
        // Add elements and confirm size
        ll.addBack( nodeData );
        ll.addBack( nodeData2 );
        ll.addBack( nodeData3 );
        ll.addBack( nodeData4 );
        confirmSize( 4 );

        // Confirm string is correct
        String expectedString = generateForwardString();
        assertEquals( expectedString, ll.toString() );
    }

    private String generateForwardString()
    {
        return nodeData + " " + nodeData2 + " " + nodeData3 + " " + nodeData4;
    }

    @Test
    public void testMixedElementAddition()
    {
        // Add elements and confirm size
        ll.addFront( nodeData );  // 4
        ll.addBack( nodeData2 );  // 17
        ll.addFront( nodeData3 ); // 2
        ll.addBack( nodeData4 );  // 3
        confirmSize( 4 );
        // End list: 2 4 17 3

        // Confirm head element
        assertEquals( nodeData3, ll.getHead() );

        // Confirm tail element
        assertEquals( nodeData4, ll.getTail() );
    }

    @Test
    public void testRemoveHeadFromEmptyList()
    {
        // Remove head from empty list
        ll.removeHead();

        // Confirm list is empty
        confirmListIsEmpty();
    }

    @Test
    public void testRemoveHeadFrom1ElementList()
    {
        // Add element & remove from front
        ll.addFront( nodeData );
        ll.removeHead();

        // Confirm list is empty
        confirmListIsEmpty();
    }

    @Test
    public void testRemoveHeadFrom2ElementList()
    {
        // Add elements & remove one from front
        create2ElementList();
        ll.removeHead();

        // Confirm list shortened and changed
        confirmSize( 1 );
        assertEquals( nodeData2, ll.getHead() );
    }

    @Ignore
    private void create2ElementList()
    {
        ll.addFront( nodeData );
        ll.addBack( nodeData2 );
    }

    @Test
    public void testRemoveHeadFromGeneralList()
    {
        // Create list and remove head
        int size = createGeneralList();
        ll.removeHead();

        // Confirm list shortened and new head chosen
        confirmSize( size - 1 );
        assertEquals( nodeData2, ll.getHead() );
    }

    @Ignore
    private int createGeneralList()
    {
        ll.addBack( nodeData );
        ll.addBack( nodeData2 );
        ll.addBack( nodeData3 );
        ll.addBack( nodeData4 );

        return 4;
    }

    @Test
    public void testRemoveTailFromEmptyList()
    {
        // Remove tail from empty list
        ll.removeTail();

        // Confirm list is empty
        confirmListIsEmpty();
    }

    @Test
    public void testRemoveTailFrom1ElementList()
    {
        // Add element & remove from back
        ll.addFront( nodeData );
        ll.removeTail();

        // Confirm list is empty
        confirmListIsEmpty();
    }

    @Test
    public void testRemoveTailFrom2ElementList()
    {
        // Add elements & remove one from back
        create2ElementList();
        ll.removeTail();

        // Confirm list shortened and new tail chosen
        confirmSize( 1 );
        assertEquals( nodeData, ll.getTail() );
    }

    @Test
    public void testRemoveTailFromGeneralList()
    {
        // Create list and remove tail
        int size = createGeneralList();
        ll.removeTail();

        // Confirm list shortened and new tail chosen
        confirmSize( size - 1 );
        assertEquals( nodeData3, ll.getTail() );
    }

    @Test
    public void testRemoveElementWithNegativeIndex()
    {
        try
        {
            ll.removeAtIndex( -1 );
        }
        catch ( IndexOutOfBoundsException e )
        {
            return;
        }

        fail();
    }

    @Test
    public void testRemoveElementWithHeadIndex()
    {
        // Create list & remove head
        int size = createGeneralList();
        ll.removeAtIndex( 0 );

        // Confirm list shortened and new head chosen
        confirmSize( size - 1 );
        assertEquals( nodeData2, ll.getHead() );
    }

    @Test
    public void testRemoveElementWithTailIndex()
    {
        // Create list & remove head
        int size = createGeneralList();
        ll.removeAtIndex( 3 );

        // Confirm list shortened and new tail chosen
        confirmSize( size - 1 );
        assertEquals( nodeData3, ll.getTail() );
    }

    @Test
    public void testRemoveElementAtArbitraryIndex()
    {
        // Create list and index 2
        int size = createGeneralList();
        ll.removeAtIndex( 2 );

        String expectedString = nodeData + " " + nodeData2 + " " + nodeData4;
        confirmSize( size - 1 );
        assertEquals( expectedString, ll.toString() );
    }

    @Test
    public void testClearList()
    {
        createGeneralList();
        ll.clear();
        confirmListIsEmpty();
    }
}
