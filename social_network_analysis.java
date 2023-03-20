public import java.io.*;
import java.util.*;
import java.util.*;
import java.util.*;
 public class Solution {
    public static void main(String args[])
    {   Scanner sn=new Scanner(System.in);
        int n,m;
        n=sn.nextInt();
        m=sn.nextInt();
        
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            arr.add(new ArrayList<>());    // excatly  n+1 no of empty arraylist been added ;
        }

        for(int i=1;i<=m;i++)
        {
            int a=sn.nextInt();
            int b=sn.nextInt();
            arr.get(a).add(b);
            arr.get(b).add(a);
        }
         int max=0;
        for(int i=1;i<=m;i++)
        {
           int size=arr.get(i).size();
           max=Math.max(max,size);
        } 
        // max size of arraylist is   :: max 
        for(int i=1;i<=m;i++)
        {
            int size=arr.get(i).size();
            if(size==max)
            {
                System.out.print(i+" ");
            }
        }
        //System.out.println(arr);
       // System.out.println(arr.toString());
    }

    
}
 {
    
}
