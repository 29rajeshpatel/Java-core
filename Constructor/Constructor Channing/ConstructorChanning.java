class abc
{
    abc(int x)
    {   
        this(true);
      System.out.println("int abc");
    }

   
    abc(char x)
    {
      System.out.println("char abc");
    }

    
    abc(float x)
    {
       this(45);
      System.out.println("float abc");
    }

   
    abc(boolean x)
    {
        this('R');
      System.out.println("boolean abc");
    }

}

class ConstructorChanning
{
      public static void main(String args[])
       {
         abc aa = new abc(1.5f);
       }
}