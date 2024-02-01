import java.util.*;

class LoopNM
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the Value N = ");
    int n = sc.nextInt();
    
    System.out.print("Enter the Value M = ");
    int m = sc.nextInt();
     
    for(int i=n; i<=m; i++)
     {
       if(i%2==0)
        {
         System.out.print(i + " ");
        }
     }
  }
}
  