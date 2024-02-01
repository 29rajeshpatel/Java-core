class FinalVariable
{
  public static void main(String args[])
  {
    // int a=45;
   final int a = 45;
    System.out.println("a = " + a);
   
    // a = 50;  // Error , can't assign a value to final variable a
    System.out.println("a = " + a);
  }
}