import java.util.Scanner;
class Question_thirteen{
   public static void main(String []args){
	   Float num1, num2, sum, sum1;
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter width of a rectangle ");
	   num1 = sc.nextFloat();
	   
	   System.out.println("Enter height of a rectangle ");
	   num2 = sc.nextFloat();
	   
	   sc.close();
	   sum = 2*(num1 + num2);
	   sum1 = num1 * num2;
	   System.out.println("Perimeter of a rectangle is " + sum);
	   System.out.println("Area of a rectangle is " + sum1);
	   
  }
   
}