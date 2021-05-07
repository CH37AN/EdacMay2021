import java.util.Scanner;

class Question_Twenty_four {

	public static void main(String[] args) 
	{
		String Oct;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Binary number:");
		String x=s.next();
		int dec=Integer.parseInt(x,2);
		
		
		Oct=Integer.toOctalString(dec);
		System.out.println("Ocatal number:"+Oct);
	}
}