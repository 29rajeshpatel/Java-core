package rajesh;

public class abc extends mno
{
    public void add(int x , int y)
    {
      System.out.println("Rajesh's Add = " + (x+y));
    }
  
    private void minus(int x , int y)
    {
      System.out.println("Rajesh's Minus = " + (x-y));
    }

    protected void multiply(int x , int y)
    {
      System.out.println("Rajesh's Multiply = " + (x*y));
    }

     void divide(int x , int y)
    {
      System.out.println("Rajesh's Divide = " +(x/y));
    }
}

class mno
{
   public void cube(int x)
   {
     System.out.println("Cube = " + (x*x*x));
   }
}