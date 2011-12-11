import com.colabug.LinkedList;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class LinkedListTest
{
    private LinkedList ll;
    private static int nodeData  = 4;

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

}
