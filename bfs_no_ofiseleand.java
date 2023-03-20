//{ Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    class GFG {
        public static void main(String[] args) throws IOException {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine().trim());
            while (T-- > 0) {
                String[] s = br.readLine().trim().split(" ");
                int n = Integer.parseInt(s[0]);
                int m = Integer.parseInt(s[1]);
                char[][] grid = new char[n][m];
                for (int i = 0; i < n; i++) {
                    String[] S = br.readLine().trim().split(" ");
                    for (int j = 0; j < m; j++) {
                        grid[i][j] = S[j].charAt(0);
                    }
                }
                Solution obj = new Solution();
                int ans = obj.numIslands(grid);
                System.out.println(ans);
            }
        }
    }
    // } Driver Code Ends
    
    class pair
    {
        int first,second;
        public pair(int first,int second)
        {
            this.first=first;
            this.second=second;
        }
        
    }
    class Solution {
        // Function to find the number of islands.
        public int numIslands(char[][] grid) {
            // Code here
             int n=grid.length;
             int m=grid[0].length;  
             int visited[][]=new int[n][m];
             int count=0;
             for(int row=0;row<n;row++)
             {
                 for(int col=0;col<m;col++)
                 {
                     if(visited[row][col]==0 && grid[row][col]=='1') // not visited and is island
                     {   count++;
                         visited[row][col]=1;
                         bfs(row,col,visited,grid);
                         
                     }
                 }
             }
             return count;
             
        } 
        
        public static void bfs(int row,int col,int visited[][],char grid[][])
        {
            int n=grid.length;
            int m=grid[0].length;
            //int c=0;
            Queue<pair> q=new LinkedList<pair>();
            q.add(new pair(row,col));
            
            while(!q.isEmpty())
            {
                int row1=q.peek().first;
                int col1=q.peek().second;
                q.remove();
                
                
                for(int i=-1;i<=1;i++)
                {
                for(int j=-1;j<=1;j++)
                {
                    int nrow=row1+i;
                    int ncol=col1+j;
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
                    visited[nrow][ncol]==0 && grid[nrow][ncol]=='1')
                    {   
                        visited[nrow][ncol]=1;
                        q.add(new pair(nrow,ncol));
                    }
                }
                }
            }
        }
    }