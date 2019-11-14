import java.util.ArrayList;
import java.util.Scanner;

public class longWord {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String x;
		int max=0;
		String word = "";
		int prevIndex=0;
		ArrayList <String> myFileLines = new ArrayList <String>();
		String input="";
		System.out.println("Welcome to the picture box maker");
		System.out.print("Please enter a sentence: ");
		input= myScanner.nextLine();
		for(int i=0;i<input.length();i++){
			if (input.charAt(i)!=' '){
				word= word+input.charAt(i);
			}
			else{
				myFileLines.add(word);
				word="";
			}
			if(i==input.length()-1){
				myFileLines.add(word);
			}
		}
		for(int y=0; y<myFileLines.size();y++){
			if(myFileLines.get(y).length()>max){
				max= myFileLines.get(y).length();
			}
		}
		for(int xx=0; xx<myFileLines.size();xx++){
			for(int yy=0; yy<max;yy++){
				if(myFileLines.get(xx).substring(xx).isEmpty()==false){
					word= word+myFileLines.get(xx).charAt(xx);
				}
				else{
					word=word+" ";
				}
			}
			myFileLines.get(xx).replaceAll(myFileLines.get(xx).substring(0,myFileLines.get(xx).length()), word);
		}
		for(int d=0; d<max+1;d++){

			System.out.print("*");

		}
		System.out.println("");
		for(int z=0; z<myFileLines.size();z++){

			System.out.println("*"+myFileLines.get(z)+"*");

		}
		for(int g=0; g<max+1;g++){

			System.out.print("*");

		}
		
	}
}