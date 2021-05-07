public class Question_Twenty_one{    
   public static void main(String args[])
   {
    
     int i = 17,  r;   
     String str= ""; 
     char hex[]={'0','1','2','3','4','5','6','7'};
        while(i>0)
     {
        r = i % 8; 
        str = hex[r]+str; 
        i = i/8;
     }
     System.out.println("Decimal to Octal conversion is: "+str);
  }
}