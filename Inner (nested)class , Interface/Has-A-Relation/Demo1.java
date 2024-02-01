// static inner class with static method

class Outer 
{
    static class Inner 
    {
      static public void add(int x , int y)
       {
          System.out.println("Add = " + (x+y));
       }
    }
}

class Demo1
{
     public static void main(String args[])
     {
        Outer.Inner.add(4,5);
     }
}