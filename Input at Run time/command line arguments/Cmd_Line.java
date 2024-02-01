class Cmd_Line
{
   public static void main(String args[])  
   {
      // System.out.println(args[0] + args[1]);  // it will concatinate & not perform methemetics operations
    /*  System.out.println("From CMD");
      System.out.println(args[0]);
      System.out.println(args[1]);
      System.out.println(args[2]);
      System.out.println(args[3]);  */

      String s1 = "15";
      String s2 = "10";
      System.out.println(s1+s2);    // concatinate

      int a = Integer.parseInt(s1);
      int b = Integer.parseInt(s2);
      System.out.println(a+b);        // sum

      int x = Integer.parseInt(args[0]);
      int y = Integer.parseInt(args[1]);
      System.out.println(x+y);            // sum
 
   }
}