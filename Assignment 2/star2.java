public class star2{
public static void main(String args[]){
int n = 6;
for(int i = 1;i<=5;i++){
     for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
