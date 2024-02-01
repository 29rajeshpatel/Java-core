class Moon
{
   // Constructor
    public Moon()
    {
       System.out.println("Constructor Method");  
    }

   // Method 
    public void Moon()
   {
     System.out.println("Normal Method");
   }
}

class ConstructorDemo
{
    public static void main(String args[])
   {
     Moon mn = new Moon();
     mn.Moon();              // if don't want to call normal method so comment this method
   }
}