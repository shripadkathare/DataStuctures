public class DeleteHead_CLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.nxt = new Node(20);
        head.nxt.nxt = new Node(30);
        head.nxt.nxt.nxt = head;
        Node headd = delloop(head);
        display(headd);
        System.out.println();
        dellswap(headd);
        display(headd);
    }
    static Node delloop(Node head )
    {
        if(head == null || head.nxt == null) return null;
        Node curr = head;
        while(curr.nxt != head)
        {
            curr = curr.nxt;
        }
        curr.nxt = head.nxt;
        return curr.nxt;
    }
    static Node dellswap(Node head)
    {
        if(head == null || head.nxt == null) return null;
        head.data = head.nxt.data;
        head.nxt = head.nxt.nxt;
        return head;
    }
    static void display(Node head)
    {
        if(head == null) return ;
        Node curr = head;
        do{
            System.out.print(curr.data +" ");
            curr = curr.nxt;
        }while(curr != head);
    }
}
class Node
{
    int data ;
    Node nxt;
    Node(int data)
    {
        this.data = data;
    }
}