import java.util.Scanner;
import java.util.InputMismatchException;
public class Multiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=0;
		int m=0;
		
		for( ; ;)
		{
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
			try {
				n=scanner.nextInt();
				m=scanner.nextInt();
				break;
			}
			catch(InputMismatchException e) 
			{
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scanner.next();
			}
	}
		System.out.print(n+"x"+m+"="+n*m);
		scanner.close();
	}

}
