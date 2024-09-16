package Searching;

public class SearchSortedMatrixMovingDirection {
	
	public static boolean findKey(int[][] matrix, int noofrows, int noofcol, int n)
	{
		int i = noofrows -1;
		int j=0;
		
		while(i>=0 && j< noofcol)
		{
			if(matrix[i][j] == n)
			{
				return true;
			}
			
			if(n> matrix[i][j])
				j++;
			else
				i--;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = 
	        {
		      {10, 11, 12, 13},
		      {14, 15, 16, 17},
		      {27, 29, 30, 31},
		      {32, 33, 39, 50}
		    };

       boolean x = findKey(matrix, 4, 4, 16);
       System.out.println(x);

	}

}

//start from the lowest-left element. Check if the target is greater than the current position if so, move to the right, else move upwards
//The matrix is sorted, so we don’t need to search the entire matrix. Instead, we optimize our searching in such a way that the whole matrix does not need to be traversed.

//Since we traverse the matrix only once and at each step and we eliminate an entire row or column, the time complexity is now O(n + m).
