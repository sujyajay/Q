package questions;
import java.util.Scanner;
public class Q12 {

	public static void main(String[] args) {

		System.out.println("Enter a data : ");
		Scanner scan = new Scanner(System.in);
		String inputData = scan.next();
		
		int inputD = Integer.parseInt(inputData);		
		String s = String.valueOf(inputD);
		System.out.println(s);
		//System.out.println(inputD);
		
		int size = inputData.length();
		int[] rev = new int[size] ;
				
		for(int i=0; i<size;i++) {
			rev[i] = inputD % 10;
			inputD = inputD/10;			
		}
				
		long num = 908071;
		long rev0 = 0;
		while(num!=0) {
			
			rev0 = rev0*10+num%10;
			num = num/10;			
		}
		
		System.out.println("New Way of doing this : " + rev0);
		
		System.out.println("BUFFER: " + new StringBuffer(String.valueOf(rev0)).reverse());
		
		for(int a:rev) {
		System.out.print(a);
		}
		
		//System.out.println(Integer.parseInt(rev));
		
		
	}

}