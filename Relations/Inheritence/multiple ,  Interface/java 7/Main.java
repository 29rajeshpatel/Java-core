interface abc 
{
  public abstract void add(int x , int y);
  public void min(int x , int y);
   void mul(int x , int y);

}

class xyz implements abc
{
   @Override
   public void add(int x , int y)
   {
     System.out.println("Add = " + (x+y));
   }

  @Override
   public void min(int x , int y)
   {
     System.out.println("Min = " + (x-y));
   }
   
  @Override
   public void mul(int x , int y)
   {
     System.out.println("Mul = " + (x/y));
   }
}

class Main
{
    public static void main(String args[])
    {
       xyz xx = new xyz();
        xx.add(5,6);
        xx.min(5,4);
        xx.mul(10,2);
    }
}