// static inner class with Non-static method

class Outer 
{
    static class Inner 
    {
       public void add(int x , int y)
       {
          System.out.println("Add = " + (x+y));
       }
    }
}

class Demo2
{
     public static void main(String args[])
     {
        Outer.Inner oi = new Outer.Inner();
         oi.add(5,4);
     }
}