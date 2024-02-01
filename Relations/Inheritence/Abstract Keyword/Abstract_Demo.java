abstract class Abc
{
    public void lefthand()
    {
       System.out.println("Abc's lefthand ");
    }
   
    abstract public void righthand();
    
}

class Xyz extends Abc
{
   public void righthand()
   {
       System.out.println("Abc's righthand");
   }
}
  
class Abstract_Demo
{
   public static void main(String args[])
   {
     Abc ab = new Xyz();
      ab.lefthand();
      ab.righthand();
  
   }
}