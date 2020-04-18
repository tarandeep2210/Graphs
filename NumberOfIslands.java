package Graphs;

public class NumberOfIslands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] grid = {
				{'1','1','1','1','0'},
				{'1','1','1','1','0'},
				{'1','1','1','1','0'},
				{'1','1','1','1','0'},
				{'1','1','1','1','0'}	
		};
		
		System.out.println(numIslands(grid));

	}
	
	    public static int numIslands(char[][] grid) {
	        
	        int noOfIslands=0;
	        boolean visited[][] = new boolean[grid.length][grid[0].length];
	        
	        for(int i=0;i<grid.length;i++){
	            for(int j=0;j<grid[i].length;j++){
	                if(grid[i][j]=='1' && !visited[i][j]){
	                    DFS(i,j,visited,grid);
	                    noOfIslands++;
	                }
	                    
	            }
	        }
	        
	        return noOfIslands;
	        
	    }
	    
	    public static boolean isSafe(int i, int j , boolean visited[][],char[][] grid){
	        
	        return i>=0 && i<grid.length && j>=0 && j<grid[i].length && !visited[i][j] && grid[i][j] == '1';
	    }
	    
	    public static void DFS(int i, int j , boolean visited[][],char[][] grid){
	        
	    	
	    	if(visited[i][j]) return;
	    	
	        int x[] = {1,-1,0,0};
	        int y[] = {0,0,1,-1};
	        
	        visited[i][j] = true;
	        
	        for(int k=0;k<4;k++){
	            if(isSafe(i+x[k],j+y[k],visited,grid)){
	                DFS(i+x[k],j+y[k],visited,grid);
	            }
	        }
	        
	        return;
	    }
	

}
