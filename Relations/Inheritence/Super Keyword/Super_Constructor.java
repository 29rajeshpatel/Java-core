// constructor ki inheritance nahi hoti h.

class abc
{
   public abc()
   {
       System.out.println("ABC's Constructor" );
   }
}

class xyz extends abc
{
   public xyz()
   {
       System.out.println("XYZ's Constructor" );
   }
   
}

class Super_Constructor
{
    public static void main(String args[])
    {
        xyz xx = new xyz();
        
    }
}