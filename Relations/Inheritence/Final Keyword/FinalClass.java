final class ABC
{
   public void add(int x, int y)
   {
      System.out.println("ABC's = " + (x+y)); 
   }
}

class XYZ // extends ABC  // error , can't inherit of  final class ABC because final keyword.
{
}

class FinalClass
{
   public static void main(String args[])
   {
      // XYZ xx = new XYZ();
      // xx.add(1,2);
      
      ABC ab = new ABC();
      ab.add(15,15);
   }
}