public class dfs_implemenation_recurssion {
    public ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans=new ArrayList<>();
        boolean visited[]=new boolean[v+1];
        dfs(0,ans,adj,visited);
        return ans;
        
    }
    public void dfs(int x,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> adj,boolean visited[])
    {
        visited[x]=true;
        ans.add(x);
        for(Integer it:adj.get(x))
        {
            if(!visited[it])
            {
               
                dfs(it,ans,adj,visited);
            }
        }
    }
}