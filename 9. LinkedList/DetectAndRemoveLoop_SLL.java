public class DetectAndRemoveLoop_SLL {
    public static void main(String[] args) {
        Node head=new Node(15);
    	head.next=new Node(10);
    	head.next.next=new Node(12);
    	head.next.next.next=new Node(20);
    	head.next.next.next.next=head.next;
    	head =detectRemove(head);
        display(head);
    }
    static Node detectRemove(Node head)
    {
        Node slow = head , fast = head;
        if(head == null || head.next == null) return head;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) break;
        }
        if(slow != fast) return head;
        slow = head;
        while(slow.next != fast.next)
        {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
        return head;
    }
    static void display(Node head)
    {
        Node curr = head;
        if(head == null) return;
        while(curr != null)
        {
            System.out.print(curr.data +" ");
            curr = curr.next;
        }
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