import java.util.*;

class LoopEOSeparate
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
  
    
    System.out.print("Enter the Value A = ");
    int a = sc.nextInt();

   
    
    for(int i=1; i<=a; i++)
     {  
       if(i%2==0)
       {
        System.out.print("Even = " + i);
        if(i%3==0)
        {
          System.out.println("Odd =  " + i);
        }
       }
     }
      
  }
}
  