class abc
{
   int a;
}

class xyz extends abc
{
   int a;

   public void setInfo(int x, int y)
   {
      super.a = x;
      a = y;
   }
   
   public void getInfo()
   {
     System.out.println("a = " + super.a);
     System.out.println("a = " + a); 
   }
}

class super_variable
{
    public static void main(String args[])
    {
        xyz xx = new xyz();
        xx.setInfo(100,200);
        xx.getInfo();
    }
}