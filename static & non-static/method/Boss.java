// Static and non-static method
//By default all memebers are non-static in java untill prefix by static keyword


class Calculator
{
    public void add(int x, int y)
 {
   System.out.println("add = " + (x+y));
 }

 static public void minus(int x, int y)
 {
  System.out.println("minus = " + (x-y));
 }

}
 
class Boss
{
   public static void main(String args[])
  {
   Calculator.minus(15,10);
   Calculator cl = new Calculator();   // declaration and initialization
   cl.add(15,10);
  }
}