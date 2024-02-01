//fall through statement in Switch

import java.lang.String;
import java.lang.System;
import java.lang.Integer;

class SwitchAlphabet
{
   public static void main(String args[])
   {
       java.util.Scanner sc= new java.util.Scanner(System.in);
       
       System.out.print("Enter any Alphabet = ");
       String str=sc.next();
       char ch =str.charAt(0);

       if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
        {
           switch(str)
            {
              case "a":
              case "e":
              case "i":
              case "o":
              case "u":
              case "A":
              case "E":
              case "I":
              case "O":
              case "U":
              System.out.println("This is a Vowel");
             break;
     
            default:
              System.out.println("This is a Consonent");
            }
        }
        else 
        { 
           System.out.println("Invalid Input");
        }
     }
}