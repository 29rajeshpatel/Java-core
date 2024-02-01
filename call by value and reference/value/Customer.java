class PNB
{ 
   int sa;

}

class SBI
{
   int ca;
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
    
    }
}