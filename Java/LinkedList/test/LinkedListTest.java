import com.colabug.LinkedList;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class LinkedListTest
{
    private LinkedList ll;
    private static int nodeData  = 4;
    private static int nodeData2 = 17;
    private static int nodeData3 = 2;
    private static int nodeData4 = 3;

    @Before
    public void setUp()
    {
        // Create empty linked list
        ll = new LinkedList();
    }

    @Test
    public void newListIsEmpty()
    {
        // Confirm list is empty
        assertTrue( ll.isEmpty() );
    }

    @Test
    public void testAddFront()
    {
        // Add element
        ll.addFront( nodeData );

        // Confirm not empty
        assertTrue( !ll.isEmpty() );

        // Confirm size
        assertEquals( 1, ll.size() );

        // Confirm element is at front and tail of list
        assertEquals( nodeData, ll.getHead() );
        assertEquals( nodeData, ll.getTail() );
    }

    @Test
    public void testAdd2ElementsToFront()
    {
        // Add elements
        ll.addFront( nodeData );
        ll.addFront( nodeData2 );

        // Confirm second element added is the head
        assertEquals( nodeData2, ll.getHead() );

        // Confirm first element added is the tail
        assertEquals( nodeData, ll.getTail() );

        // Confirm size
        assertEquals( 2, ll.size() );
    }

    @Test
    public void testAdd3ElementsToFront()
    {
        // Add elements
        ll.addFront( nodeData );
        ll.addFront( nodeData2 );
        ll.addFront( nodeData3 );

        // Confirm third element added is the head
        assertEquals( nodeData3, ll.getHead() );

        // Confirm first element added is the tail
        assertEquals( nodeData, ll.getTail() );

        // Confirm size
        assertEquals( 3, ll.size() );
    }

    @Test
    public void testAddBack()
    {
        // Add back
        ll.addBack( nodeData );

        // Confirm element is head and tail
        assertEquals( nodeData, ll.getHead() );
        assertEquals( nodeData, ll.getTail() );

        // Confirm size
        assertEquals( 1, ll.size() );
    }

    @Test
    public void testAdd2ElementsToBack()
    {
        // Add elements
        ll.addBack( nodeData );
        ll.addBack( nodeData2 );

        // Confirm first element added is the head
        assertEquals( nodeData, ll.getHead() );

        // Confirm last element added is the tail
        assertEquals( nodeData2, ll.getTail() );

        // Confirm size
        assertEquals( 2, ll.size() );
    }

    @Test
    public void testAdd3ElementsToBack()
    {
        // Add elements
        ll.addBack( nodeData );
        ll.addBack( nodeData2 );
        ll.addBack( nodeData3 );

        // Confirm first element added is the head
        assertEquals( nodeData, ll.getHead() );

        // Confirm last element added is the tail
        assertEquals( nodeData3, ll.getTail() );

        // Confirm size
        assertEquals( 3, ll.size() );
    }

    @Test
    public void testMixedElementAddition()
    {
        // Add elements
        ll.addFront( nodeData );  // 4
        ll.addBack( nodeData2 );  // 17
        ll.addFront( nodeData3 ); // 2
        ll.addBack( nodeData4 );  // 3
        // End list: 2 4 17 3

        // Confirm head element
        assertEquals( nodeData3, ll.getHead() );

        // Confirm tail element
        assertEquals( nodeData4, ll.getTail() );

        // Confirm size
        assertEquals( 4, ll.size() );
    }

    @Test
    public void testToStringFromAddingBack()
    {
        ll.addBack( nodeData );
        ll.addBack( nodeData2 );
        ll.addBack( nodeData3 );
        ll.addBack( nodeData4 );

        // Confirm string is correct
        String expectedString = nodeData + " " + nodeData2 + " " + nodeData3 + " " + nodeData4;
        assertEquals( expectedString, ll.toString() );

        // Confirm size
        assertEquals( 4, ll.size() );
    }

    @Test
    public void testToStringFromAddingFront()
    {
        ll.addFront( nodeData );
        ll.addFront( nodeData2 );
        ll.addFront( nodeData3 );
        ll.addFront( nodeData4 );

        // Confirm string is correct
        String expectedString = nodeData4 + " " + nodeData3 + " " + nodeData2 + " " + nodeData;
        assertEquals( expectedString, ll.toString() );

        // Confirm size
        assertEquals( 4, ll.size() );
    }
}
