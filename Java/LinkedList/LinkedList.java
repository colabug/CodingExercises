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
            createNewHeadNode(nodeData);
        }
        // Populated list
        else
        {
            Node node = new Node(nodeData, head.next);
            head = node;
        }
    }

    private void createNewHeadNode(int nodeData)
    {
        Node node = new Node(nodeData, null);
        head = node;
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
