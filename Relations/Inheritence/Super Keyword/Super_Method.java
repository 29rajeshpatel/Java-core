//Inheritance ke samey ye possible ho sakta h ki parent class aur child class ke methods ki prototype same hojaye tb child class parent class ke method ko hide kardegi //, agar parent class ke method ko child class me visible karna chahete ho toh super keyword ka use kare.

class abc
{
   public void add(int x, int y)
   {
       System.out.println("ABC's Add = " + (x+y));
   }
}

class xyz extends abc
{
   public void add(int x, int y)
   {
       System.out.println("XYZ's Add = " + (x+y));
   }

   public void display(int x, int y)
   {
       super.add(x,y);
       add(x,y); 
   }
}

class Super_Method
{
    public static void main(String args[])
    {
        xyz xx = new xyz();
        xx.display(1,2);
    }
}