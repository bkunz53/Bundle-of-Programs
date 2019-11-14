public class WordCount 
{
	public static void main(String args[])
	{
	System.out.println(countWords(IO.readString(),7));
	}
	public static int countWords(String original, int maxLength)
	{
		int count=0;
		int j=0;
		for (int i=0;i<(original.length()-1);i++)
		{
		        if (original.charAt(i) != ' ')
		        {
		            if(original.charAt(i)>='a' && original.charAt(i)<='z')
		            j++;
		            continue;
		        }
		        if(j<=maxLength)
		        {
		             count++;
		        }
		        j=0;
		}
		return count;
	}

}
