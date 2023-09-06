public class Detectloop {
    public static void main(String[] args) {
        Node head=new Node(15);
    	head.next=new Node(10);
    	head.next.next=new Node(12);
    	head.next.next.next=new Node(20);
    	head.next.next.next.next=head.next;
        if(search(head))
        {
            System.out.println("loop found");
        }
        else System.out.println("not found");
    }
    static boolean search(Node head)
    {
        Node temp = new Node(0);
        Node curr = head;
        while(curr != null)
        {
            if(curr.next == null) return false;
            if(curr.next == temp) return true;
            Node nextcurr = curr.next;
            curr.next = temp;
            curr = nextcurr;
        }
        return false;
    }
}
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}