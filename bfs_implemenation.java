import java.util.*;
public class bfs_implemenation {

    public static void main(String args[])
    {

    }
    public ArrayList<Integer> bfs_traversal(int n,ArrayList<ArrayList<Integer>> list) // list is adjency matrix which contains the neighbours of elemnets 
    {
        ArrayList<Integer> bfs=new ArrayList<>();  // store final ans of traversal 
        boolean visited[]=new boolean[n];   // status of visited 
        Queue <Integer> q=new LinkedList<>();  // queue for breadth first algo FIFO 
        q.add(0);
        visited[0]=true;
        while(q.isEmpty()==false)
        {
            Integer node=q.poll();
            bfs.add(node);  // add answer to the list 
            for(Integer i:list.get(node))
            {
                if(visited[i]==false)  // only then add them to queue for further traversal 
                { 
                    visited[i]=true;   // mark visited 
                    q.add(i);          // add to queue 
                }
            }
        }

        return bfs;

    }
    
}
