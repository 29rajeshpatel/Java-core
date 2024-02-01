class Calci
{
    private Calci()
   {}

  public void add(int x , int y)

  { 
    System.out.println("add = " + (x+y));
  }

  
  public static Calci createInstance()
  {
     Calci ob = new Calci();
       return ob;   
  }
  
  
}

class FactoryMethod
{
  public static void main(String args[])
  {
    // Calci cl = new Calci(); 

     Calci ob = Calci.createInstance();   // factory method
      ob.add(45,15);
   }
}