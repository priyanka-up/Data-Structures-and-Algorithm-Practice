package hashing;

public class Hashing {
	
	public static String getValue(int key)
	{
		String[] arr = {
				"1","2","3"
		};
		
		if(key <= arr.length)
			return arr[key];
		else
			return "";
	}
	
	public static void main(String args[])
	{
		System.out.println(getValue(2));
	}

}
