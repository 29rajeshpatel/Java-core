// outer class

class abc 
{
    // iner class 
    public static class xyz
    {
      public void add(int x , int y)
       {
         System.out.println("Add = " + (x+y));
       }
    }
}

class Moon extends abc.xyz
  {}

class main
{   
   public static void main(String args[])
   {
      Moon mm = new Moon();
      mm.add(5,4);
   }
}