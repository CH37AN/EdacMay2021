public class pattern18{
public static void main(String args[]){
	for(int i = 0; i<=4;i++){
		char a = 65;
		for(int j = 4; j>=i;j--){
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
	}
}
}