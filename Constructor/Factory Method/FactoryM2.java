class Gadank
{
    private Gadank()
    {}
    public void add(int x , int y)
    {
       System.out.println("Addition = " + (x+y));
    }
     
    public static Gadank createInstance()
    {
      Gadank gk = new Gadank();
      return gk;
    }
}

class FactoryM2
{
    public static void main(String args[])
     {
        Gadank gk = Gadank.createInstance();
        gk.add(15,15);
     }
}
       