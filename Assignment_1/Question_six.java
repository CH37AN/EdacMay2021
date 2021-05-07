import java.util.Scanner;
class Question_six{
   public static void main(String []args){
	   int num1, num2, sum1, sum2, sum3, sum4, sum5;
	   Scanner sc = new Scanner(System.in);
	   
	   num1 = sc.nextInt();
	   num2 = sc.nextInt();
	   
	   sc.close();
	   
	   sum1 = num1+num2;
	   sum2 = num1-num2;
	   sum3 = num1*num2;
	   sum4 = num1/num2;
	   sum5 = num1%num2;
	   
	   System.out.println(sum1);
	   System.out.println(sum2);
	   System.out.println(sum3);
	   System.out.println(sum4);
	   System.out.println(sum5);
  }  
}