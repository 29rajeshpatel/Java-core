import java.util.*;

class LoopTable
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the Value A = ");
    int a = sc.nextInt();
    
   for(int i=1; i<=10; i++)
     {
      System.out.println(a + " * " + i + " = " + (a*i));
      
     }
  }
}
  