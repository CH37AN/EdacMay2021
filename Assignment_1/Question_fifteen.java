import java.util.*;  
class Question_fifteen {  
    public static void main(String[] args)
	{  
       int a, b, c;                         
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of a and b");  
	   
       a = sc.nextInt();  
       b = sc.nextInt();
	   

       c = a + b;  
       a = c - b;  
       b = a + c;  
	   
       System.out.println("After swapping:  "+ a +"   " + b);  
       System.out.println( );  
    }    
}  