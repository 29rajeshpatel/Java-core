// Local Method Inner Class
class Outer
{
    public void display(int x , int y)
     {
        class Inner
        {
          public void add(int x , int y)
           {
             System.out.println("Add = " + (x+y));
           }
         }
           Inner in  = new Inner();
            in.add(x,y);
      }
}
 
class Demo6
{
       public static void main(String args[])
       {
         Outer ot = new Outer();
          ot.display(4,5);
       } 
}  