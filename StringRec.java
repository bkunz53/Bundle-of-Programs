public class StringRec {
	public static String decompress(String compressedText){
		String decomp="";
		char a;
		a=compressedText.charAt(0);
		if(compressedText.length()<=1){
			return compressedText;
		}
		if (Character.isDigit(a)){
			if(a!='0'){
				a--;
				decomp=decomp+compressedText.substring(1,2)+decompress(a+compressedText.substring(1));
			}
			else{
				decomp=decomp+decompress(compressedText.substring(2));
			}
		}
		else{
			decomp=decomp+compressedText.substring(0,1)+decompress(compressedText.substring(1));
		}
		return decomp;
	}
}