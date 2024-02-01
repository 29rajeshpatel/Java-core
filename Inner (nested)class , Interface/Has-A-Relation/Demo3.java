// Non-static inner class with Non-static method

class Outer 
{
     class Inner 
    {
       public void add(int x , int y)
       {
          System.out.println("Add = " + (x+y));
       }
    }
}

class Demo3
{
     public static void main(String args[])
     {
      Outer ot = new Outer();
      Outer.Inner in = ot.new Inner();
       in.add(5,4);

       Outer.Inner in1 = new Outer().new Inner();
        in1.add(6,7);

       new Outer().new Inner().add(8,9);
     }
}