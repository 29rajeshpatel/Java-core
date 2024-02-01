import java.util.*;

class Loop3Distence
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the Value N = ");
    int n = sc.nextInt();
    
    System.out.print("Enter the Value M = ");
    int m = sc.nextInt();
     
    for(int i=1; i<=n; i=i+m)
     {
      System.out.print(i + " ");
     }
  }
}
  