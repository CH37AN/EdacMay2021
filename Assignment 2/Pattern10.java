public class Pattern10  {              
public static void main(String[] args) 
	{
		int alpha=64;
		for(int i=5;i>=1;i--)
        {
            for(int j=2;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=5;k++)
            {
                System.out.print((char)(alpha+k)+" ");
            }
            
            System.out.println();
   
		} 
		}
} 