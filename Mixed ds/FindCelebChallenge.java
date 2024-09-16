package examples;

public class FindCelebChallenge {
	//returns true if x knows y else returns false
	private static boolean aqStatus(int[][] party, int x, int y)
	{
		if(party[x][y] == 1)
			return true;
		return false;
	}
	
	private static int findCelebrity(int[][] party, int numPeople)
	{
		Stack<Integer> stack = new Stack<Integer>(numPeople);
		int celebrity = -1;
		
		//push all people in stack
		for(int i=0; i<numPeople; i++)
		{
			stack.push(i);
		}
		
		while(!stack.isEmpty())
		{
			//take two people out of stack and check if they know each other 
			//one who does not know the other, push it back in the stack.
			
			int x = stack.pop();
			
			if(stack.isEmpty())
			{
				celebrity = x;
				break;
			}
			
			int y= stack.pop();
			if(aqStatus(party, x, y))
			{
				//x knows y, discard x and push y in the stack
				stack.push(y);
			}else
				stack.push(x);
		}
		
		//At this point we will have last element of stack as celebrity
		//check it to make sure its the right celebrity
		
		for(int j=0; j<numPeople; j++)
		{
			if (celebrity != j && (aqStatus(party, celebrity, j) || !(aqStatus(party, j, celebrity)))) return -1;
        }
        return celebrity;
    }//end of findCelebrity()

    public static void main(String args[]) {
        
        int [][] party1 = {
          {0,1,1,0},
          {1,0,1,1},
          {0,0,0,0},
          {0,1,1,0},   
        };

        int [][] party2 = {
          {0,1,1,0},
          {1,0,1,1},
          {0,0,0,1},
          {0,1,1,0},   
        };

        int [][] party3 = {
          {0,0,0,0},
          {1,0,0,1},
          {1,0,0,1},
          {1,1,1,0},   
        };
        
        System.out.println(findCelebrity(party1,4));
        System.out.println(findCelebrity(party2,4));
        System.out.println(findCelebrity(party3,4));
    }
}