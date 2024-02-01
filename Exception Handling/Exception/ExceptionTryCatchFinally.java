class ExceptionTryCatchFinally
{
   public static void main(String args[])
    {
       int a = Integer.parseInt(args[0]);
       int b = Integer.parseInt(args[1]);
       int c = Integer.parseInt(args[2]);
       int d[] = {4,8,6,7,2,5};

       System.out.println("Statement 1");
      
      
     try
       {
          int e = a/b;
         System.out.println("Statement 2 - Divide = " + e);
         System.out.println("Statement 3 - Array = " + d[c]);
       }
       catch(ArithmeticException | ArrayIndexOutOfBoundsException ae)
        {
          if(ae instanceof ArithmeticException)
           {
            System.out.println("Statement 4 - Divided by zero is not possible");
           }
         
          if(ae instanceof ArrayIndexOutOfBoundsException)
            {
             System.out.println("Statement 5 - Sorry !! Array Index Out of Bounds Exception ");
            } 
        }
       finally
        {
          System.out.println("Statement 6 - All the Very Best For Future Endeavors.");
        }
    }
}
      