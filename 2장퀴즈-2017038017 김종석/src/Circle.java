import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int r1, r2;
		
		System.out.print("ù���� ���� x ��ǥ : ");
		int cir1_x=scan.nextInt();
		System.out.print("ù���� ���� y ��ǥ : ");
		int cir1_y=scan.nextInt();
		System.out.print("ù���� ���� ������ : ");
		int cir1_rad=scan.nextInt();
		System.out.print("�ι��� ���� x ��ǥ : ");
		int cir2_x=scan.nextInt();
		System.out.print("�ι��� ���� y ��ǥ : ");
		int cir2_y=scan.nextInt();
		System.out.print("�ι��� ���� ������ : ");
		int cir2_rad=scan.nextInt();
		
		double distance;
		distance = Math.sqrt(((cir1_x-cir2_x)*(cir1_x-cir2_x))+((cir1_y-cir2_y)*(cir1_y-cir2_y)));
		
		if(cir1_rad>=cir2_rad)
		{
			r1=cir1_rad;
			r2=cir2_rad;
		}
		else
		{
			r2=cir1_rad;
			r1=cir2_rad;
		}
		
		if(((r1-r2)<distance && (r1+r2)>distance))
			System.out.println("�� ���� �� ������ ���Ѵ�.");
		else if(r1-r2==distance||r1+r2==distance)
			System.out.println("�� ���� �� ������ ���Ѵ�");
		else
			System.out.println("�� ���� ��ġ�� �ʴ´�.");
	}

}
