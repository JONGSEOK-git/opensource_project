import java.util.Scanner;

class Seat{
	String name="---";
	String sab="";
	int seat_num=0;
}

public class Reservation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		
		Scanner scan=new Scanner(System.in);
		int num;
		boolean result=true;
		boolean result2=true;
		Seat data[];
		data=new Seat[30];
		int i=0;
		String names;
		
		for(int w=0; w<30; w++)
			data[w] = new Seat(); 
		
		while(result)
		{
			result2=true;
			System.out.print("���� :1, ��ȸ:2, ���:3, ������:4>>");
			num=scan.nextInt();
			
			{
			if(num==1)
			{
				int num2;
				
				
				while(result2) {
				System.out.print("�¼����� S(1), A(2), B(3)>>>");
				num2=scan.nextInt();
					if (num2==1)
					{	
						System.out.print("�̸�>>");
						names=scan.next();
						System.out.print("��ȣ>>");
						i=scan.nextInt();
						i--;
						
						data[i].sab="S";
						data[i].name=names;
						data[i].seat_num=i+1;
						result2=false;
					}
					else if (num2==2)
					{
						System.out.print("�̸�>>");
						names=scan.next();
						System.out.print("��ȣ>>");
						i=scan.nextInt();
						i--;
						i=i+10;
						
						data[i].sab="A";
						data[i].name=names;
						data[i].seat_num=i-9;
						result2=false;
					}
					else if (num2==3)
					{
						System.out.print("�̸�>>");
						names=scan.next();
						System.out.print("��ȣ>>");
						i=scan.nextInt();
						i--;
						i=i+20;
						
						data[i].sab="B";
						data[i].name=names;
						data[i].seat_num=i-19;
						result2=false;
					}
					else
						System.out.println("��ȣ�� �ٽ� �Է����ּ���.");
				}
			}
				else if(num==2)
				{
					System.out.print("S>>");
					for(int j=0; j<10; j++)
					{
						System.out.print(" "+data[j].name+" ");
					}
					
					System.out.println();
					System.out.print("A>>");
					for(int j=10; j<20; j++)
					{
						System.out.print(" "+data[j].name+" ");
					}
				
					System.out.println();
					System.out.print("B>>");
					for(int j=20; j<30; j++)
					{
						System.out.print(" "+data[j].name+" ");
					}
					System.out.println();

					System.out.println("��ȸ�� �Ϸ�Ǿ����ϴ�.");
				}
				
				else if (num== 3)
				{
					String sab_2="";
					while(result2) 
					{
						System.out.print("�̸�>>");
						names=scan.next();
						for(int j=0;j<30;j++)
						{
							if((data[j].name).contentEquals(names))
							{
								data[j].name="---";
								sab_2=data[j].sab;
								data[j].sab="";
								data[j].seat_num=0;
								result2=false;
								break;
							}
						}
					}
					 
					
					if((sab_2).contentEquals("S"))
					{
						System.out.print("S>>");
						for(int j=0; j<10; j++)
						{
							System.out.print(" "+data[j].name+" ");
						}
					}
				
					if((sab_2).contentEquals("A"))
					{
						System.out.print("A>>");
						for(int j=10; j<20; j++)
						{
							System.out.print(" "+data[j].name+" ");
						}
					}
					if((sab_2).contentEquals("B"))
					{
						System.out.print("B>>");
						for(int j=20; j<30; j++)
						{
							System.out.print(" "+data[j].name+" ");
						}
					}
					System.out.println();
					System.out.println("��ȸ�� �Ϸ�Ǿ����ϴ�.");
				}
				
				else if(num== 4)
					result=false;
				
				else
					System.out.println("��ȣ�� �ٽ� �Է����ּ���.");
					
			}
		}
	}

}