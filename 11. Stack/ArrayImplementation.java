import java.util.ArrayList;

public class ArrayImplementation {
    public static void main(String[] args) {
        Mystack m = new Mystack(3);
        m.push(11);
        m.push(12);
        System.out.println( m.size());
        m.pop();
        System.out.println(m.size());
        System.out.println(m.isempty());
        m.pop();

        System.out.println("-------------------------------------------------");
        ArrayListStack al = new ArrayListStack();
        al.push(11);
        al.push(12);
        System.out.println( al.size());
        al.pop(); 
        System.out.println( al.size());


    }
}

class Mystack
{
    int cap;
    int top =-1;
    int arr[];
    Mystack(int c)
    {
        cap = c;
        arr = new int [cap]; 
    }
    void push(int x)
    {
        if(top==cap-1) System.out.println("overflow");
        top++;
        arr[top] = x;
    }
    void pop()
    {
        if(cap==-1) System.out.println("stack underflow");
        int res = arr[top];
        top--;
        System.out.println(res);
    }
    int size()
    {
        return top+1;
    }
    boolean isempty()
    {
        return (top==-1);
    }
    int peek()
    {
        return arr[top];
    }
}
class ArrayListStack
{
    ArrayList<Integer> al = new ArrayList<>();
    void push(int x)
    {
        al.add(x);
    }
    void pop()
    {
        int res = al.get(al.size()-1);
        al.remove(al.remove(al.size()-1));
        System.out.println(res);
    }
    int peek()
    {
        return al.get(al.size()-1);
    }
    boolean isempty()
    {
        return al.isEmpty();
    }
    int size()
    {
        return al.size();
    }
}