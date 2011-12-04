import java.lang.*;

public class LinkedListManager
{
    LinkedList ll;

    LinkedListManager() 
    {
        ll = new LinkedList();
    }

    public void createLinkedListManager(String argv[])
    {
        // Process node data
        for (int i = 0; i < argv.length; i++) 
        {
            System.out.println("Creating node! Position = " + i);
            ll.addFront(Integer.valueOf(argv[i]));
        }
    }
}
