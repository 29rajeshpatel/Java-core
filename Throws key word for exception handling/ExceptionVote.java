import java.util.Scanner;

class Voting
{
    public static void checkAge(int age)throws ArithmeticException
    {
        if(age < 18)
        {
           throw new ArithmeticException("Access Denied : You are Under age ");
        }
        else
        {
          throw new ArithmeticException("Access Granted : WelCome for Voting ");
        }
    }
}

class ExceptionVote
{
        public static void main(String args[])
        {
          Scanner sc = new Scanner(System.in);
     
          System.out.print("Conform your age = ");
          int age = sc.nextInt();
    
         try
          {
            Voting.checkAge(age);
          }
         catch(ArithmeticException ae)
          {
            System.out.println(ae.getMessage());
          }
        }
  }
      
          