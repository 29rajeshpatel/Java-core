import java.util.Scanner;

class Question5
{
     public static void main(String args[])
     {
        double km,mt,ft,inch,cm;
        
       Scanner sc = new Scanner(System.in);
        
       System.out.print("Enter Kilometer = ");
       km = sc.nextDouble();

       mt= km*1000;
       ft= mt*3.3;
       inch= ft*12;
       cm=mt*100;

       System.out.println("Meter = " + mt);
       System.out.println("Feet = " + ft);
       System.out.println("Inch = " + inch);
       System.out.println("CM = "+ cm );
     }
}
