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
   public xyz(char x , int y)
   {
       super(y);
       System.out.println("XYZ's Constructor = " + x );
   }
   
}
class mno extends xyz
{
   public mno(float x , char y ,int z)
   {
       super(y,z);
       System.out.println("MNO's Constructor = " + x );
   }
   
}

class Super_Constructor3
{
    public static void main(String args[])
    {
        mno mn = new mno(2.6f , 'R' , 15);
        
    }
}