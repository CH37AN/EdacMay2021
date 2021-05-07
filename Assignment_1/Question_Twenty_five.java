import java.util.Scanner;

public Question_Twenty_five {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Decimal number:");
		String x=s.next();
		
		int oct=Integer.parseInt(x,8);
		System.out.println("Ocatal number:"+oct);

	}
}