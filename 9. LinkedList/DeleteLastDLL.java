public class DeleteLastDLL {
    public static void main(String[] args) {
        Node  head = new Node(10);
        Node head1 = new Node(20);
        Node head2 = new Node(30);
        head.next = head1;
        head1.prev = head;
        head1.next = head2;
        head2.prev = head1;
        head = delLast(head);
        display(head);
        
    }
    static Node delLast(Node head)
    {
        if(head == null || head.next==null) return null;
        else
        {
            Node curr = head;
            while(curr.next != null)
            {
                curr = curr.next;
            }
            curr.prev.next = null;
            return head;
        }
    }
    static void display(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
    }
}