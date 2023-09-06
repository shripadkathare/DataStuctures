public class ImplementationOfOpenAddressing {
    public static void main(String[] args) {
        myhash mh = new myhash(7);
        System.out.println( mh.insert(32));
        System.out.println(mh.insert(54));
        System.out.println( mh.search(76));
        System.out.println(mh.delete(32));
        System.out.println(mh.search(32));
    }

}
class myhash
{
    int arr[];
    int cap ,  size;
    myhash(int c)
    {
        cap = c;
        size=0;
        arr = new int[cap];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=-1;
        }
    }
    int hash(int i)
    {
        return i%cap;
    }
    
    boolean search(int x)
    {
        int h = hash(x);
        int i =h;
        while(arr[i] != -1)
        {
            if(arr[i] == x)
            {
                return true;
            }
            i =  (i+1)%cap;
            if(i==h)
            {
                return false;
            }
        }
        return false;
    }
    boolean insert(int x)
    {
        if(size == cap) return false;
        int i = hash(x);
        while(arr[i] != x && arr[i] != -1  && arr[i] != -2)
        {
            i=(i+1)%cap;
        }
        if(arr[i] == x) return false;
        else{
            arr[i] = x;
            size++;
            return true;
        }
    }
    boolean delete(int x)
    {
        int h = hash(x);
        int i=h;
        while(arr[i] != -1)
        {
            if(arr[i]==x)
            {
                arr[i]=-2;
                size--;
                return true;
            }
            i=(i+1)%cap;
            if(i == h) return false;
        }
        return false;

    }
}
