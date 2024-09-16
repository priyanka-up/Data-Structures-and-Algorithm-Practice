package hashing;

public class HashFunArithmatic {
	
	public static int findIndex(int key, int size)
	{
		return key % size;
	}
	public static void main(String args[])
	{
		int[] list = new int[10];
		int key =35;
		int index = findIndex(key,10);
		System.out.println(index);
	}

}
