class Moon
{  
    int a = 15;
    static int b = 17;
   
   public Moon()
   {
      System.out.println("Constructor Block");
   }

   {
     System.out.println("Initializer Block = " + a +","+ b);
   }

   static
   {
     System.out.println("Static Block = " + b);
   }
}

class Block
{
   public static void main(String args[])
    {
      Moon m1 = new Moon();
      Moon m2 = new Moon();
      Moon m3 = new Moon();
      Moon m4 = new Moon();
    }
}