import java.util.Arrays;
import java.util.Scanner;
public class Store {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System. in);
		int num=-1;
		while (num<0){
			System.out.print("How many numbers would you like to store: ");
			num= keyboard.nextInt();
			if (num<0){
				System.out.println("Wrong");
			}
		}
		
		int store[]= new int[num];
		for (int i=0; i<store.length; i++) {
			System.out.print("Whats the number: ");
			int input= keyboard.nextInt();
			store[i]=input;
		}
		if (num>0){
			System.out.println("Heres what you inputted: "+Arrays.toString(store));
		}
		if(num==0){
			System.out.println("okay");
		}
		
	
	}
}