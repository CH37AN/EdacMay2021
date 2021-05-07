public class Question_Twenty{    
   public static void main(String args[])
   {
    
     int i = 17,  r;   
     String str= ""; 
     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(i>0)
     {
        r = i % 16; 
        str = hex[r]+str; 
        i = i/16;
     }
     System.out.println("Decimal to hexadecimal conversion is: "+str);
  }
}