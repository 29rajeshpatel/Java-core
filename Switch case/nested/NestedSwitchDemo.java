import java.util.*;
 
class NestedSwitchDemo
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Press 1 for Day");
      System.out.println("Press 2 for Vowel or Consonent");
      System.out.print("\n Enter choice = ");
      int ch = sc.nextInt();

      switch(ch)
      {
         case 1:
                System.out.print("Enter date = ");
                 int date = sc.nextInt();

                 if(date>=1 && date<=31)
                 {
                    date = date % 7;
                   switch(date)
                   {
                    case 1:
                       System.out.println("Monday");
                    break;
                    
                   case 2:
                       System.out.println("Tuesday");
                    break;
                   
                   case 3:
                       System.out.println("Wednesday");
                    break;
                    
                   case 4:
                       System.out.print("Thursday");
                    break;
                   
                   case 5:
                       System.out.println("Friday");
                    break;
                  
                   case 6:
                       System.out.println("Saturday");
                    break;
                   
                   case 0:
                       System.out.println("Sunday");
                    break;
                  
                 }
               
              }
                else
                 {
                    System.out.println("Not a Date");
                  }
         break;
         
         case 2:
                System.out.print("Enter Alphabet = ");
                  String str=sc.next();
                  char cr=str.charAt(0);
                  if(cr>='a' && cr<='z' || cr>='A' && cr<='Z')
                  {
                  switch(cr)
                   {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                     case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                     System.out.println("Vowel");
                   break;
                  
                 default:
                        System.out.println("Consonent");
                  }
                }
                else
                {
                   System.out.println("not an alphabet");
                }
          break;
          
         default:
               System.out.println("invalid choice");
            
        }
    }
}
