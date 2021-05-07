import java.util.Scanner;
class Question_seven{
   public static void main(String []args){
	   int num1;
	   Scanner sc = new Scanner(System.in);
	   
	   num1 = sc.nextInt();
	     sc.close();
	   for(int i = 1; i <= 10; ++i)
	   {
		   System.out.printf("%d*%d=%d\n", num1, i, num1 * i); 
	   
  }
   
}
}