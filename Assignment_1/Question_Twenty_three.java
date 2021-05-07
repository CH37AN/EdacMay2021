import java.util.Scanner;

class Question_Twenty_three {

	public static void main(String[] args) 
	{
	String Hexa;
	Scanner s=new Scanner(System.in);
		
	System.out.println("Enter Binary number:");
	String x=s.next();
	int dec=Integer.parseInt(x,2);
		
	Hexa=Integer.toHexString(dec);
	System.out.println("HexaDecimal number:"+Hexa);
	}
}