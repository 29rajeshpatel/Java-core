import java.util.*;

class LoopAdd
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the Value A = ");
    int a = sc.nextInt();
    
    int sum = 0;
    
   for(int i=1; i<=a; i++)
     {
       sum = sum + i;
      System.out.print(i + " ");
     }
      System.out.print(" = " + sum);
  }
}
  