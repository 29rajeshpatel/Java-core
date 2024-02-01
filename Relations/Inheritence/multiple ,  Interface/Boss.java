interface abc
{
   public void add(int x , int y);
}
  
interface xyz
{
   public void min(int x , int y);
}

interface mno
{
   public void mul(int x , int y);
}

class Moon implements abc,xyz,mno
{
   public void add(int x , int y)
   {
      System.out.println("Add = " + (x+y));
   }
   
  public void min(int x , int y)
   {
      System.out.println("Min = " + (x-y));
   }
  
  public void mul(int x , int y)
  {
     System.out.println("Mul = " + (x*y));
  }
}

class Boss
{
  public static void main(String args[])
   {
     Moon moon = new Moon();
      moon.add(4,5);
      moon.min(5,6);
      moon.mul(4,6);
     
     System.out.println("-------------------------");
    
    abc aa = new Moon();
    aa.add(4,5);
    
    xyz xx = new Moon();
    xx.min(5,6);

    mno mm = new Moon();
    mm.mul(4,6);
   }
}
   
