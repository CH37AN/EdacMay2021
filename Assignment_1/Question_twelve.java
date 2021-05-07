import java.util.Scanner;
class Question_twelve{
   public static void main(String []args){
	   int num1, num2, num3, sum;
	   Scanner sc = new Scanner(System.in);
	   
	   num1 = sc.nextInt();
	   num2 = sc.nextInt();
	   num3 = sc.nextInt();
	   
	   sc.close();
	   sum = (num1+num2+num3)/3;
	   System.out.println("Average of the three number is " + sum);
  }
   
}