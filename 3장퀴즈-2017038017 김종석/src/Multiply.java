import java.util.Scanner;
import java.util.InputMismatchException;
public class Multiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=0;
		int m=0;
		
		for( ; ;)
		{
			System.out.print("곱하고자 하는 두 수 입력>>");
			try {
				n=scanner.nextInt();
				m=scanner.nextInt();
				break;
			}
			catch(InputMismatchException e) 
			{
				System.out.println("실수는 입력하면 안됩니다.");
				scanner.next();
			}
	}
		System.out.print(n+"x"+m+"="+n*m);
		scanner.close();
	}

}
