
public class KingMaze {
	static int n;
	public static void main(String[] args) {
		
		KingMaze king = new KingMaze();
		int maze[][] = {   { 1, 0, 0 },
	 					   { 1, 1, 1},
	 					   { 0, 0, 1}
	 					  
	 			};

		n = maze.length;
		
		
		king.solveMaze(maze, n);
	}

	private boolean solveMaze(int[][] maze, int n ) {
		
		int sol[][]=new int[n][n];
		if(mazeRecur(maze, sol,0,0,n)==false)
		{
			System.out.println("No possible solution");
			return  false;
		}
		else
		{
			printMaze(sol,n);
			return true;
		}
		
		// TODO Auto-generated method stub
		
	}

	private boolean mazeRecur(int[][] maze, int[][] sol, int i, int j, int n) {
		// TODO Auto-generated method stub
		
		if(i==n-1 && j==n-1 && maze[i][j]==1)
		{
			sol[i][j]=1;
			return true;
		}
		if(elemwtisSafe(maze,i,j)==true)
		{
			if(sol[i][j]==1)
			
				return false;
			sol[i][j]=1;
			
			if(mazeRecur(maze, sol, i+1, j, n))
				return true;
			if(mazeRecur(maze, sol, i, j+1, n))
				return true;
			if(mazeRecur(maze, sol, i-1, j, n))
				return true;
			if(mazeRecur(maze, sol, i, j-1, n))
				return true;
			
			sol[i][j]=0;
			return false;
			
		}
		
		return false;
	}

	

	private boolean elemwtisSafe(int[][] maze, int i, int j) {
		// TODO Auto-generated method stub
		if(i>=0 && i<n &&j>=0 && j<n &&maze[i][j]==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private void printMaze(int[][] sol, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(
						" " + sol[i][j] + " ");
				
			}
			System.out.println();
		}
		
	}

	

	

	
}
