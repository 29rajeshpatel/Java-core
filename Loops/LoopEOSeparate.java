import java.util.*;

class LoopEOSeparate
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
  
    
    System.out.print("Enter the Value A = ");
    int a = sc.nextInt();
     
    int even = 0 ,  odd = 0;

    for(int i=1; i<=a; i++)
     {  
        if(i%2==0)
        {
          even = even + i;
        }
        else
        {
          odd = odd + i;
        }
      }
       System.out.println("Even = " + even);
       System.out.println("Odd = " + odd);

       System.out.println((even > odd ? "Even is Greater" : "Odd is Greater"));
  }  
}
  