import java.lang.*;

public class LinkedList {
    
    Node head;

    LinkedList()
    {
        head = null;
    }

    public void addFront(int nodeData)
    {
        // Empty list, made node head
        if (isEmpty())
        {
            Node node = new Node(nodeData, null);
            head = node;
        }
        // Populated list
        else
        {
            Node node = new Node(nodeData, head.next);
            head = node;
        }
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
        // TODO:
    }
}
