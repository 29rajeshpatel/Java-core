class ExceptionDemo
{
     public static void main(String args[])
     {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
      
      try
      {
        int c = a / b; // jvm will through an anonymous object of "through new ArithmeticException()"

        System.out.println("Divide = " + c);
      }
      catch(ArithmeticException ae)
      {
        System.out.println("oop's divide by zero is not possible in arithmetic");
      }

        System.out.println("All Is Well");
    }
}