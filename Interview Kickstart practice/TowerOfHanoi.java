package IK;

public class TowerOfHanoi {
	
	public static void towerOfHanoi(int n, char from_road, char to_road, char aux_road)
	{
		if(n==0)
			return;
		towerOfHanoi(n-1,from_road,aux_road,to_road);
		System.out.println("Move disk "+ n + " from road " + from_road +" to rod " + to_road );
		towerOfHanoi(n-1,aux_road,to_road,from_road);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		towerOfHanoi(n,'A','C','B');//rods

	}

}
