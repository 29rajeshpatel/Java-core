class Program2
{
    public static void main(String args[])
    {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);

      if(a>b)
      {
        System.out.println("A is greater then B");
      }
      
      else if(b>a)
      {
        System.out.println("B is greater then A");
      }

      else
      {
        System.out.println("Both are equals");
      }
  }
}