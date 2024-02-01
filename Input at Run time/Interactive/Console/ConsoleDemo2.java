import java.io.Console;

class ConsoleDemo2
{
    public static void main (String args[])
    {
       Console con = System.console(); 
        
       System.out.print("Enter Username = ");
       String s1 = con.readLine();
        

        System.out.print("Enter Password = ");
        char ch[] = con.readPassword();         // value ko ch[] me lena hoga kyoki passward kuch bhi ho sakta h like symbol,string,int etc.
         
        String s2 = String.valueOf(ch);
        
        if(s2.equals("Raj12"))
         {
            System.out.println("welcome , " + s1);
         }
        else 
          {
            System.out.println("sorry! invalid input");
          }
    }
}
            

      