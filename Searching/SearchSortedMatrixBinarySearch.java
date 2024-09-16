package Searching;

public class SearchSortedMatrixBinarySearch {
	
	public static boolean findKey(int[][] matrix, int noofrows, int noofcol, int n)
	{
		int min = 0;
		int max = noofrows * noofcol -1;
		
		while(min <= max)
		{
			int middle = (min + max) /2;
			int row = middle / noofcol;
			int col = middle % noofcol;
			
			if(n < matrix[row][col])
			{
				max = middle -1;
			}
			else if(n > matrix[row][col])
			{
				min = middle + 1;
			}
			else
			{
				return true;
			}
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

       boolean x = findKey(matrix, 4, 4, 80);
       System.out.println(x);

	}

}


//Since all elements are sorted, we just do a binary search imagining a “flattened” version of the array. When an array element has to be accessed, convert the 1D index into row and column numbers using simple division and remainder formulae.

//The time complexity using binary search is O(logn + logm)
