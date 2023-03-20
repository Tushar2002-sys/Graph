import java.util.*;
public class implement_list {
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

        for(int i=0;i<=n;i++)
        {
            int a=sn.nextInt();
            int b=sn.nextInt();
            arr.get(a).add(b);
            arr.get(b).add(a);
        }
        System.out.println(arr);
        System.out.println(arr.toString());
    }

    
}
