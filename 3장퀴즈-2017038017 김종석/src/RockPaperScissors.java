import java.util.Scanner;
public class RockPaperScissors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String com[]= {"����", "����", "��"};
		String rps;
		int num=0;
		double randomValue=Math.random();
		
		while(true)
		{
			System.out.println("��ǻ�Ϳ� ���� ���� �������� �մϴ�.");
			System.out.print("���� ���� ��!>>");
			rps=scan.nextLine();
			
			num=(int)(randomValue*3);
			
			switch(rps)
			{
				case "����" :
					switch(com[num])
					{
						case "����" :
							System.out.println("�����="+rps+" ��ǻ��="+com[num]+", �����ϴ�.");
							continue;
						case "����":
							System.out.println("�����="+rps+" ��ǻ��="+com[num]+", ����ڰ� �����ϴ�.");
							continue;
						case "��" :
							System.out.println("�����="+rps+" ��ǻ��="+com[num]+", ����ڰ� �̰���ϴ�.");
							continue;
					}
				case "����" :
					switch(com[num])
					{
						case "����" :
							System.out.println("�����="+rps+" ��ǻ��="+com[num]+", ����ڰ� �̰���ϴ�.");
							continue;
						case "����":
							System.out.println("�����="+rps+" ��ǻ��="+com[num]+", �����ϴ�.");
							continue;
						case "��" :
							System.out.println("�����="+rps+" ��ǻ��="+com[num]+", ����ڰ� �����ϴ�.");
							continue;
					}
				case "��" :
					switch(com[num])
					{
						case "����" :
							System.out.println("�����="+rps+" ��ǻ��="+com[num]+", ����ڰ� �����ϴ�.");
							continue;
						case "����":
							System.out.println("�����="+rps+" ��ǻ��="+com[num]+", ����ڰ� �̰���ϴ�.");
							continue;
						case "��" :
							System.out.println("�����="+rps+" ��ǻ��="+com[num]+", �����ϴ�.");
							continue;
					}
				case "�׸�" :
					System.out.println("������ �׸��մϴ�.");
					System.exit(0);
			}
		}
	}

}
