import java.lang.*;

public class LinkedList
{
    Node head;
    int size = 0;

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

        // Increase size
        size++;
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

        // Increase size
        size++;
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
        // Cycle through list
        System.out.println("Nodes:");
        for (Node currentNode = head;
            currentNode != null;
            currentNode = currentNode.next)
        {
            System.out.println(currentNode.data);
        }
    }

    public int size()
    {
        return size;
    }
}
