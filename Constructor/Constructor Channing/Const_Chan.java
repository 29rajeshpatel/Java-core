class Calcu
{
   public Calcu(int a , int b)
   {  
     this(20.0,10.0);
     int c = a + b;
     System.out.println("Add = " + c);
   }
   
     public Calcu(float a , float b)
   {  
     
     float d = a - b;
     System.out.println("Subs = " + d);
   }

     public Calcu(double a , double b)
   {  
      this(20.0f,10.0f);
     double e = a + b;
     System.out.println("Mult = " + e);
   }
}

class Const_Chan
{
   public static void main(String args[])
    {
       Calcu cl = new Calcu(20,10);
    }
}
      