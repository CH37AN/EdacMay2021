import java.util.Scanner;
import java.lang.Math;
class Question_eleven{
   public static void main(String []args){
	   double radius, sum, sum1;
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter radius of a Circle ");
	   radius = sc.nextFloat();
	   
	   sc.close();
	      
	   sum = (2 * Math.PI * radius);
       sum1 = (Math.PI*(radius*radius));
	   System.out.println("Perimeter is = " + sum);
       System.out.println("Area is = " + sum1);
	 
  }
  }