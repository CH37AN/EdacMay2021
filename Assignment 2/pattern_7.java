class pattern_7{  
public static void main(String args[])   
{    
int i, j, row = 6;        
for (i=0; i<row; i++)   
{  
      
for (j=row-i; j>1; j--)   
{  
 
System.out.print(" ");   
}   
 
for (j=1; j<=i; j++ )   
{        
System.out.print(j+" ");   
}    
System.out.println();   
}   
}   
}