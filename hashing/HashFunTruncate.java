package hashing;

public class HashFunTruncate {
	public static int findIndex(int key)
	{
		return key % 500;
	}
	
	public static void main(String args[])
	{
		int key = 123456;
		int index = findIndex(key);
		System.out.println(index);
	}

}
