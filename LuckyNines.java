
public class LuckyNines 
{
	public static void main(String args[])
	{
		int lowerEnd = IO.readInt();
		int upperEnd= IO.readInt();
		IO.outputIntAnswer(countLuckyNines(lowerEnd,upperEnd));
	}
	public static int countLuckyNines(int lowerEnd, int upperEnd) 
	{
		int sum=0;
		int length=0;
		String x= "";
		//System.out.println("lowerEnd range");
		//System.out.println("upperEnd range");

		if (upperEnd<lowerEnd)
		{
			//IO.reportBadInput();
			return(-1);
		}
		for (int n=lowerEnd; n<=upperEnd;n++)
		{
			x = Integer.toString(n);
			length= x.length();
			for (int i=0; i<length; i++)
			{
				if((x.charAt(i))=='9')
				{
					sum=sum+1;
					//System.out.println(n);
				}
			}		
		}
		return sum;
	}
}
