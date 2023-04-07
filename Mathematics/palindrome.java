//checking original value and reverse value are same
public class palindrome
 {
    public static void main(String args[]){  
          
        int num=454; 
        int rev=0; //reverse -> numbers get added futher
        int  temp=num;    
        while(num>0)
        {   
            int lastDigit=num%10;        //getting remainder  
             rev=rev*10+lastDigit;    // reverse
            num=num/10;                 
            
        }    
        if(temp==rev)    
         System.out.println("palindrome number ");    
        else    
         System.out.println("not palindrome");    
      }  
}  
