import java.util.Arrays;
import java.util.Collections;

class ArraySortingAscnd
{
     public static void main(String arg[])
      {
        Integer a[] ={4,2,1,6,5,7,8,3};
        
        Arrays.sort(a,Collections.reverseOrder());
  
        for(int w : a)
        {
          System.out.println(w);
        }
      }
}