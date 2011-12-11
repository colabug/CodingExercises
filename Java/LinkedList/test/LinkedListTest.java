import com.colabug.LinkedList;
import org.junit.Before;
import org.junit.Ignore;
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
        confirmSize( 0 );
    }

    @Test
    public void testAddFront()
    {
        // Add element
        ll.addFront( nodeData );

        // Confirm size
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
        // Add elements
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
        // Add elements
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
        ll.addFront( nodeData );
        ll.addFront( nodeData2 );
        ll.addFront( nodeData3 );
        ll.addFront( nodeData4 );
        confirmSize( 4 );

        // Confirm string is correct
        String expectedString = nodeData4 + " " + nodeData3 + " " + nodeData2 + " " + nodeData;
        assertEquals( expectedString, ll.toString() );
    }

    @Test
    public void testAddBack()
    {
        // Add back
        ll.addBack( nodeData );
        confirmSize( 1 );

        // Confirm element is head and tail
        assertEquals( nodeData, ll.getHead() );
        assertEquals( nodeData, ll.getTail() );
    }

    @Test
    public void testAdd2ElementsToBack()
    {
        // Add elements
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
        // Add elements
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
        ll.addBack( nodeData );
        ll.addBack( nodeData2 );
        ll.addBack( nodeData3 );
        ll.addBack( nodeData4 );
        confirmSize( 4 );

        // Confirm string is correct
        String expectedString = nodeData + " " + nodeData2 + " " + nodeData3 + " " + nodeData4;
        assertEquals( expectedString, ll.toString() );
    }

    @Test
    public void testMixedElementAddition()
    {
        // Add elements
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
        confirmSize( 0 );
        ll.removeHead();
        confirmSize( 0 );
    }

    @Test
    public void testRemoveHeadFrom1ElementList()
    {
        ll.addFront( nodeData );
        ll.removeHead();
        confirmSize( 0 );
    }

    @Test
    public void testRemoveHeadFromGeneralList()
    {
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
}
