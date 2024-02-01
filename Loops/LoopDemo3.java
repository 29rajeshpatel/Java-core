import java.util.*;

class LoopDemo3
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the Value = ");
    int v = sc.nextInt();
     
    for(int i=1; i<=v; i++)
     {
       System.out.print(i + " ");
     }
   }
}