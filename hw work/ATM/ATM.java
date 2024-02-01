import java.util.*;
class ATM
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Rs. = ");
     int rs = sc.nextInt();
      
      System.out.println("500 = " + rs/500);
      System.out.println("200 = " + rs%500/200);
      System.out.println("100 = " + rs%500%200/100);
      System.out.println("50 = " + rs%500%200%100/50);
      System.out.println("20 = " + rs%500%200%100%50/20);
      System.out.println("10 = " + rs%500%200%100%50%20/10);
      System.out.println("5 = " + rs%500%200%100%50%20%10/5);
      System.out.println("2 = " + rs%500%200%100%50%20%10%5/2);
      System.out.println("1 = " + rs%500%200%100%50%20%10%5%2/1);
  }
}

    