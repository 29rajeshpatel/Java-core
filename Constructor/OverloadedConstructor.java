// overloaded constructor 

class Area 
{
   public Area (int x, int y)
  {
    int ar= x * y;
    System.out.println("Rectangle = " + ar);
  }
  
   public Area (long x, long y)
  {
    long as= x * x;
    System.out.println("Square = " + as);
  }

  public Area (float x, float y)
  {
    float ac = 3.14F * x * y;
    System.out.println("Circle = " + ac);
  }

  public Area (double x, double y)
  {
    double at = 0.5 * x * y;
    System.out.println("Triangle = " + at);
  }
}

class OverloadedConstructor
{
   public static void main (String args[])
   {
      Area a1 = new Area(8,5);
      Area a2 = new Area(6L,5L);
      Area a3 = new Area(8.5F,6.5F);
      Area a4 = new Area(7.8,7.2);
   }
}
