import java.util.Scanner;

class Question6
{
     public static void main(String args[])
     {
        double bs,gs,da,ta,hra;
        
       Scanner sc = new Scanner(System.in);
        
       System.out.print("Enter basic salary = ");
       bs = sc.nextDouble();

       da= bs * 40 / 100;
       ta= bs * 25 / 100;
       hra= da * 25 / 100;
       gs= bs + da + ta + hra ;

       System.out.println("DA = " + da);
       System.out.println("TA = " + ta);
       System.out.println("HRA = " + hra);
       System.out.println("GS = "+ gs );
     }
}
