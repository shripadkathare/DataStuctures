public class DLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node head1 = new Node(20);
        Node head2 = new Node(30);
        head.next = head1;
        head1.prev = head;
        head1.next = head2;
        head2.prev = head1;
    }
}
class Node 
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data=data;
    }
}