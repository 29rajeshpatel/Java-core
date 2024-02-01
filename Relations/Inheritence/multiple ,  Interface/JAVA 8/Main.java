interface abc 
{
  public abstract void add(int x , int y);
 
  public static void min(int x , int y)
  {
    System.out.println("min = " + (x-y));
  }
  
  default void mul(int x , int y)
  {
    System.out.println("Mul = " + (x*y));
  }

}

class xyz implements abc
{
   @Override
   public void add(int x , int y)
   {
     System.out.println("Add = " + (x+y));
   }

 /* @Override
   public void min(int x , int y)
   {
     System.out.println("Min = " + (x-y));
   }
   
  @Override
   public void mul(int x , int y)
   {
     System.out.println("Mul = " + (x/y));
   } */
}

class Main
{
    public static void main(String args[])
    {  
       abc.min(6,5);
      
       
       xyz xx = new xyz();
        xx.add(5,6);
        xx.mul(4,5);
        
    }
}