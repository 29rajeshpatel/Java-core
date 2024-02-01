// outer class

class abc
{
       // inner interface
      interface xyz
      {
        public void add(int x , int y);
      }
 }

class Moon implements abc.xyz
{
    public void add(int x ,int y)
    {
      System.out.println("Add = " + (x+y));
    }
}

class Main
{
    public static void main(String args[])
    {
      Moon mm = new Moon();
      mm.add(4,5);
     }
}