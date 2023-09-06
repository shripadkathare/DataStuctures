class CircularDoubleLL
{
    public static void main(String[] args) {
        Node head = new Node(10);
        Node head1 = new Node(20);
        Node head2 = new Node(30);
        head.nxt = head1;
        head.prv = head2;
        head1.nxt = head2;
        head1.prv= head;
        head2.nxt = head;
        head2.prv = head1;
        head = insert(head, 9) ;
        display(head);
    }
    static Node insert(Node head , int x)
    {
        Node temp = new Node(x);
        if(head==null)
        {
            temp.nxt = temp;
            temp.prv = temp;
            return temp;
        }
        temp.nxt = head;
        temp.prv = head.prv;
        head.prv.nxt = temp;
        head.prv = temp;
        return temp;
    }
    static void display(Node head)
    {
        Node curr = head;
        if(head == null) return ;
        do
        {
            System.out.print(curr.data + " ");
            curr = curr.nxt;
        }while(curr != head);
    }
}
class Node
{
    int data;
    Node nxt;
    Node prv;
    Node(int data)
    {
        this.data = data;
    }
}