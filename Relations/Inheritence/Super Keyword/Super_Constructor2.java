// constructor ki inheritance nahi hoti h.

class abc
{
   public abc(int x)
   {
       super();
       System.out.println("ABC's Constructor = " + x );
   }
}

class xyz extends abc
{
   public xyz(int x)
   {
       super(x);
       System.out.println("XYZ's Constructor = " + x );
   }
   
}

class Super_Constructor2
{
    public static void main(String args[])
    {
        xyz xx = new xyz(15);
        
    }
}