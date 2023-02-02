import java.util.*;
public class s{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int count=0,rev=0;
       while(n>0)
       {
          n=n%10;
          count++;
          n/=10;
       }
       
       while(n>0)
       {
           int m=n%10;
          
            for(int i=1;i<count;i++)
            {
                m*=m;
            }
        
            rev+=m;
            n/=10;
       }
       if(rev==n)
       {
        System.out.println("Inputted number is  an armstrong number");
       }
       else{
        System.out.println("Inputted number is not an armstrong number");
       }
       
    }
}