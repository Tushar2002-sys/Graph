import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
       
   
       String s1,s2; 
       Scanner in = new Scanner(System.in);
       s1 = in.nextLine(); 
       s2 = s1.replaceAll("\\s","");
       System.out.print(f1(s2));       
    }
 
public static String f1(String s)
 {
  int count = 1;
  StringBuilder sb = new StringBuilder();

      for (int i = 1; i < s.length()-1 ; i++) 
        {
          if (s.charAt(i) == s.charAt(i - 1)) 
          {
            count++;
          } 
          else 
          {
            sb.append(s.charAt(i - 1));
            sb.append(count);
            count = 1;
          }
        }

      if (s.length() > 1)
        {
     
        if (s.charAt(s.length() - 1) == s.charAt(s.length() - 2))
          {
            count++;
          } 
          else 
          {
            sb.append(s.charAt(s.length() - 2));
            sb.append(count);
            count = 1;
          }
          sb.append(s.charAt(s.length() - 1));
          sb.append(count);
        }
        s = sb.toString();
      
        return s;
 }
}