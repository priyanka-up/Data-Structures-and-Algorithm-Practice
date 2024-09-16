package Searching;

public class SearchSortedMatrixBrute {
	
	public static boolean findKey(int[][] matrix, int noofrows, int noofcol, int n)
	{
		boolean result = false;
		
		for(int i=0;i< noofrows; i++)
		{
			for(int j=0; j< noofcol; j++)
			{
				if(matrix[i][j] == n)
				{
					result = true;
					return result;
				}
			}
				
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] matrix = 
			        {
				      {10, 11, 12, 13},
				      {14, 15, 16, 17},
				      {27, 29, 30, 31},
				      {32, 33, 39, 50}
				    };
		
		boolean x = findKey(matrix, 4, 4, 51);
		System.out.println(x);

	}

}

//Since we use two nested for loops, the time complexity is O(n*m)O(n∗m), where nn is the number of rows and mm is the number of columns.
