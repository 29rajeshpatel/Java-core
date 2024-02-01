class Calci
{
    private Calci()
   {}

  public static void add(int x , int y)

  { 
    System.out.println("add = " + (x+y));
  }

  
  public static void min(int x , int y)

  { 
    System.out.println("minus = " + (x-y));
  }
  
   
  public static void mul(int x , int y)

  { 
    System.out.println("mul = " + (x*y));
  }

}

class PrivateConstructor
{
  public static void main(String args[])
  {
    // Calci cl = new Calci();   // don't create object because constructore is private

      Calci.add(15,12);
      Calci.min(15,12);
      Calci.mul(15,12);
    }
}
