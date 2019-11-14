public class PigLatin 
{
	public static void main(String args[])
	{
		System.out.println(translate("ello"));
	}
	public static String translate (String original)
	{
		String translation= "";
		if (original.charAt(0)=='a'||original.charAt(0)=='A'||original.charAt(0)=='e'||
				original.charAt(0)=='E'||original.charAt(0)=='i'||original.charAt(0)=='I'||
				original.charAt(0)=='o'||original.charAt(0)=='O'||original.charAt(0)=='u'||
				original.charAt(0)=='U')
		{
			return (original+"vai");
		}
		else
		{
			translation=original.substring(1,(original.length()))+original.charAt(0);
			return (translation+"ai");
		}
	}
}
