import javax.sound.midi.Soundbank;

public class k_th__set {
    public static void main(String[] args) {
        int n =5;
        int k = 1;
        int x = (n>>(k-1));
        if((x&1)!=0)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
