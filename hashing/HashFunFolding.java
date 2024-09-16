package hashing;

//divide key into smaller chunks and apply different strategies at each chunk
public class HashFunFolding {
	
	public static int hashFold(int key, int chunk)
	{
		String str = Integer.toString(key);//convert it into string
		int hashVal =0;
		
		for(int i=0; i<= str.length(); i= i+chunk)
		{
			if(i+ chunk < str.length())
			{
				System.out.println(str.substring(i, i+chunk));
				hashVal = hashVal + Integer.parseInt(str.substring(i, i+chunk));
			}
			else
			{
				System.out.println(str.substring(i, str.length()));
				hashVal =hashVal + Integer.parseInt(str.substring(i, str.length()));
			}
		}
		return hashVal;
	}
	
	public static void main(String args[])
	{
		int key = 3456789;
		int chunk = 2;
		System.out.println(hashFold(key, chunk));
	}

}
