import java.lang.*;

public class Node 
{
    public int data;
    public Node next;

    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
        System.out.println("Node created! Data = " + data);
    }
}
