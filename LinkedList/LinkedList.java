import java.lang.*;

public class LinkedList {
    
    Node head;

    LinkedList()
    {
        head = null;
    }

    public void addFront(int nodeData)
    {
        if (head == null) 
        {
            Node node = new Node(nodeData, null);
            head = node;
        }
        else
        {
            Node node = new Node(nodeData, head.next);
            head = node;
        }
    }

    public void printList()
    {
        // TODO:
    }
}
