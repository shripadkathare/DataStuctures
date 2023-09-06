public class DeleteKth {
    public static void main(String[] args) {
        Node head=new Node(10);
    	head.nxt=new Node(20);
    	head.nxt.nxt=new Node(30);
    	head.nxt.nxt.nxt=new Node(40);
    	head.nxt.nxt.nxt.nxt=head;
    	head=del_K(head,4);
    	display(head);
    }
    static Node del_K(Node head , int k)
    {
        if(head == null) return null;
        if(k==1) return delFirst(head);
        Node curr  = head;
        for(int i=0 ; i<k-2 ; i++)
        {
            curr = curr.nxt;
        }
        curr.nxt = curr.nxt.nxt;
        return head;
    }
    static Node delFirst(Node head)
    {
        if(head == null || head.nxt == null) return null;
        // head.data = head.nxt.data;
        // head.nxt = head.nxt.nxt;
        return head.nxt;
    }
    static void display(Node head)
    {
        if(head == null) return ;
        Node curr= head;
        do{
            System.out.println(curr.data +" ");
            curr = curr.nxt;
        }while(curr != head);

    }
}
class Node 
{
    int data;
    Node nxt;
    Node(int data)
    {
        this.data = data;
    }
}