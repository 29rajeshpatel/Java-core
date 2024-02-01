import java.util.*;

class Arms
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the Number = ");
      int n = sc.nextInt();
      int a,b,c,d;
      
      if(n>=100 && n<=999)
      { 
         a = n%10;
         b = n/10%10;
         c = n/100;
         d = a*a*a + b*b*b + c*c*c;
         
       if(d==n)
       {
         System.out.println("It's armstrong number = " +d);
       }
       else 
       {  
           System.out.println("It's not armstrong number");
       }
      }
       else
        {
          System.out.println("please provide valid input");
        }
    }
 }

       
        