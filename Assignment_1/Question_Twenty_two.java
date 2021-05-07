import java.util.Scanner;

class Question_Twenty_two {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Binary number:");
		String x=s.next();
		System.out.println(Integer.parseInt(x,2));
	}
}