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

    public void addBack(int nodeData)
    {
        // Empty list, made node head
        if (isEmpty())
        {
            createNewHeadNode(nodeData);
            return;
        }

        // Find back of list
        Node currentNode = head;
        for ( ; currentNode.next != null; currentNode = currentNode.next)
        { }

        // Add node to back
        Node node = new Node(nodeData, null);
        currentNode.next = node;
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
