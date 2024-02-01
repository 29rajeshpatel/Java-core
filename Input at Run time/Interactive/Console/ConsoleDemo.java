import java.io.Console;

class ConsoleDemo
{
    public static void main (String args[])
    {
       Console con = System.console();
        
       System.out.print("Enter Value = ");
       String s1 = con.readLine();
        int a = Integer.parseInt(s1);

        System.out.print("Enter Value = ");
       String s2 = con.readLine();
        int b = Integer.parseInt(s2);

        int c = a + b;
        System.out.println("Add = " + c);
     }
}
