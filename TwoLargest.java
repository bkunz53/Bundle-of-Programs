
public class TwoLargest 
{
	public static void main(String args[])
	{
		double term,large=0,largest=0,input,n=0;
		boolean val=false;
		//IO.outputStringAnswer("What is the terminating value: ");
		term= IO.readDouble();
		//IO.outputStringAnswer("Input your values: ");
		input= IO.readDouble();
		if (input==term)
		{
			while(input==term)
			{
				IO.reportBadInput();
				input= IO.readDouble();
			}
		}
		while (val==false)
		{
			if (n==0)
			{
				large=input;
				largest=input;
			}
			if(input > largest)
			{
			    double temp = largest;
			    largest = input;
			    large = temp;
			}
			else
			{
			    if(input > large)
			    {
				large=input;
			    }
			}
			input= IO.readDouble();
			n++;
			if (input==term&&large==largest)
			{
				IO.reportBadInput();
			}
			else if (input==term)
			{
				val=true;
			}

		}
		IO.outputDoubleAnswer(largest);
		IO.outputDoubleAnswer(large);
	}
}
