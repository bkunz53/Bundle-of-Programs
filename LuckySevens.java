
public class LuckySevens 
{
	public static void main(String args[])
	{
		int lowest;
		int highest;
		int sum=0;
		int length=0;
		String x= "";
		//System.out.println("lowest range");
		lowest= IO.readInt();
		//System.out.println("highest range");
		highest= IO.readInt();
		if (highest<lowest)
		{
			IO.reportBadInput();
			return;
		}
		for (int n=lowest; n<=highest;n++)
		{
			x = Integer.toString(n);
			length= x.length();
			for (int i=0; i<length; i++)
			{
				if((x.charAt(i))=='7')
				{
					sum=sum+1;
					//System.out.println(n);
				}
			}		

		}
		IO.outputIntAnswer(sum);
	}
}
