class Moon
{
    public void add(int x , int y)
   {
      System.out.println("add1 = " + (x+y));
   }
 
  /* public void add(int x , int y)
     {
       System.out.println("add1 = " + (x+y));
     } */
  
   public void add(int x , int y , int z)
   {
      System.out.println("add2 = " + (x+y+z));
   }
   
   public void add(int x , float y)
     {
       System.out.println("add3 = " + (x+y));
     }
}

class OverloadedDemo
{
    public static void main(String args[])
    {
      Moon mn = new Moon();
      mn.add(20,25);
      mn.add(20,25,5);
      mn.add(20,24.5f);
    }
}
     
    
  