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

        // Confirm element is at front of list
        assertEquals( nodeData, ll.getHead() );
    }

    @Test
    public void testAdd2ElementsToFront()
    {
        // Add elements
        ll.addFront( nodeData );
        ll.addFront( nodeData2 );

        // Confirm second added element is at the front
        assertEquals( nodeData2, ll.getHead() );
    }

}
