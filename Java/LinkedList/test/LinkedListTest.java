import com.colabug.LinkedList;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class LinkedListTest
{
    private LinkedList ll;

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
}
