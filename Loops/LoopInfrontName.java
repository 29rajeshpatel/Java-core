import java.util.*;

class LoopInfrontName
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the Value A = ");
    int a = sc.nextInt();
    
    System.out.print("Enter the Value B = ");
    int b = sc.nextInt();
    

    for(int i=1; i<=a; i++)
     {
      System.out.print("\n" +i);
      
      if(i==b)
       {
         System.out.print(" - Rajesh");
       }
     }
  }
}
  