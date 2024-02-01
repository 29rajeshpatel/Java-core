import java.util.*;

class LoopEven
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the Value = ");
    int v = sc.nextInt();
     
    for(int i=1; i<=v; i++)
     {
       if(i%2==0)
        {
         System.out.print(i + " ");
        }
     }
  }
}