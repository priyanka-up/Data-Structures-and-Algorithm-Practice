package IK;

public class DuplicateCharwithoutUsingExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Javahh";
		char[] freq = new char[256];
		for(char ch : s.toCharArray())
		{
			freq[ch]++;
		}
		for(int i=0; i<256; i++)
		{
			if(freq[i] >1)
			{
				//char c = (char)i;
				System.out.println((char)i);
			}
			
		}

	}

}
