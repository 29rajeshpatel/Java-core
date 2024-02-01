class Moon
{
  final public void add(int x, int y)
  {
     System.out.println("Moon's add = " + (x+y));
  }
}

class Star extends Moon
{
  /* public void add(int x , int y)
  {
    System.out.println("Star's add = " + (x+y));
  } */
}

class FinalMethod
{
   public static void main(String args[])
   {
     Star sr= new Star();
     sr.add(15,20);
   }
}