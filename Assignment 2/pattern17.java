public class pattern17{
public static void main(String args[]){
	int i, c = 0, j;
	for(i = 1; i<=5;i++){
		for(j=1;j<=i;j++){
			
			c += 1;
			System.out.print(c + " ");
		}
		System.out.println();
	}
}
}