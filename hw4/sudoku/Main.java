package sudoku;

import search.SearchAlgorithm;
import search.astar.AStarSearch;
import search.dfs.DepthFirstSearch;

public class Main {

	public static void main(String[] args)
	{
		int[][] easyP = new int[][] {{5, 0, 0, 7, 0, 3, 2, 0, 6},
				                    {7, 4, 0, 0, 9, 6, 0, 5, 0},
				                    {0, 9, 6, 5, 0, 0, 4, 0, 7},
				                    {0, 2, 4, 3, 7, 0, 9, 0, 0},
				                    {6, 0, 3, 0, 1, 0, 5, 2, 0},
				                    {0, 0, 9, 0, 6, 2, 0, 7, 4},
   				                    {9, 6, 0, 2, 0, 0, 7, 0, 5},
				                    {0, 3, 7, 0, 5, 1, 0, 8, 0},
				                    {2, 0, 0, 6, 0, 7, 0, 4, 9}};
		
		int[][] mediumP = new int[][] {{0, 9, 0, 0, 0, 5, 7, 0, 0 },
									  {0, 0, 0, 0, 0, 0, 1, 6, 0},
									  {0, 0, 0, 4, 8, 7, 5, 0, 0},
									  {0, 0, 0, 0, 4, 2, 8, 0, 0},
									  {9, 6, 7, 0, 0, 0, 2, 1, 4},
									  {0, 0, 2, 7, 9, 0, 0, 0, 0},
									  {0, 0, 8, 3, 1, 4, 0, 0, 0},
									  {0, 3, 9, 0, 0, 0, 0, 0, 0},
									  {0, 0, 1, 8, 0, 0, 0, 5, 0}};
		
		int[][] hardP = new int[][] {{0, 0, 3, 0, 9, 6, 1, 0, 0},
									{0, 8, 7, 4, 0, 0, 0, 0, 0},
									{9, 0, 0, 0, 1, 0, 0, 0, 0},
									{0, 0, 8, 5, 0, 0, 0, 3, 0},
									{0, 6, 9, 0, 0, 0, 7, 5, 0},
									{0, 7, 0, 0, 0, 2, 8, 0, 0},
									{0, 0, 0, 0, 6, 0, 0, 0, 1},
									{0, 0, 0, 0, 0, 4, 6, 8, 0},
									{0, 0, 2, 8, 5, 0, 3, 0, 0}};
		
		
		SudokuState easy = new SudokuState(easyP);
		SudokuState medium = new SudokuState(mediumP);
		SudokuState hard = new SudokuState(hardP);			
		
		SearchAlgorithm dfs = new DepthFirstSearch();
		SearchAlgorithm astar = new AStarSearch();
		
		System.out.println("Doing A* search tests for Sudoku");
		
		System.out.println("Easy Sudoku");
		astar.search(easy);
		
		System.out.println("Medium Sudoku");
		astar.search(medium);
		
		System.out.println("Hard Sudoku");
		astar.search(hard);
		
		System.out.println("Doing DFS search tests for Sudoku");
		
		System.out.println("Easy Sudoku");
		dfs.search(easy);
		
		System.out.println("Medium Sudoku");
		dfs.search(medium);
		
		System.out.println("Hard Sudoku");
		dfs.search(hard);
	}
}
