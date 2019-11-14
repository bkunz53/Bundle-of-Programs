
public class SmallestLargest 
{
	public static void main(String args[])
	{
		double term,small=0,large=0,input,n=0;
		//IO.outputStringAnswer("What is the terminating value: ");
		term= IO.readDouble();
		//IO.outputStringAnswer("Input your values: ");
		input= IO.readDouble();
		while (input!=term)
		{
			if (n==0)
			{
				small=input;
				large=input;
			}
			if (input<small)
			{
			small=input;	
			}
			if (input>large)
			{
				large=input;	
			}
			input= IO.readDouble();
			n++;
		}
		if (n==0)
		{
			IO.reportBadInput();
			return;
		}
		IO.outputDoubleAnswer(small);
		IO.outputDoubleAnswer(large);
	}
}
