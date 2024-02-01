class PNB
{ 
   int sa;

}

class SBI
{
   int ca;
}

class Swap
{
    public static void change (PNB x , SBI y)   // x is alias of Rajesh and y is alias of patel
    {
      int z = x.sa;
        x.sa = y.ca;
        y.ca = z;
    }
}

class Customer
{
    public static void main(String args[])
    {
      PNB rajesh = new PNB();
      rajesh.sa = 25000;
     
      SBI patel = new SBI();
      patel.ca = 50000;

     System.out.println("Rajesh = " + rajesh.sa);
     System.out.println("Patel = " + patel.ca);

     Swap.change(rajesh , patel);
     
     System.out.println("\nRajesh = " + rajesh.sa);
     System.out.println("Patel = " + patel.ca);
    
    }
}