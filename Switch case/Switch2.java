import java.util.Scanner;

class Switch2
{
     public static void main(String args[])
     {
        int a,b,c;
        
       Scanner sc = new Scanner(System.in);

       System.out.println("Press + for Add");
       System.out.println("Press - for Minus");
       System.out.println("Press s for Swap");
       System.out.println("Enter your choice = ");

       String ch = sc.next();

       switch(ch)
        {
           case "+":
           System.out.print("Enter 1 Number = ");
            a = sc.nextInt();

            System.out.print("Enter 2 Number = ");
            b = sc.nextInt();
        
            c = a+b;
            System.out.println("Add = " + c);

        break;

           case "-":
        
           System.out.print("Enter 1 Number = ");
            a = sc.nextInt();

            System.out.print("Enter 2 Number = ");
            b = sc.nextInt();
        
            c = a-b;
            System.out.println("Minus = " + c);
        
        break;
        
         case "s":
        
           System.out.print("Enter a Number = ");
            a = sc.nextInt();

            System.out.print("Enter b Number = ");
            b = sc.nextInt();
        
            c = a;   // a= a+b; // a=a*b; //for swap
            a = b;   // b= a-b; // b=a/b;
            b = c;   // a= a-b; // a=a/b;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
       
        break;

        default:
          
            System.out.println("Sorry! it is invalid choice");
          }
      }
}

           
