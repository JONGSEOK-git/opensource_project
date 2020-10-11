import java.util.Scanner;
class Person{
	String name;
	int num[]=new int[3];
	void name_print(Person p){
		System.out.print("["+p.name+"] : <ENTER>");
	}
}

public class Gamebling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Person gamer1=new Person();
		Person gamer2=new Person();
		String en;
		
		System.out.print("1번째 선수 이름>> ");
		gamer1.name=scan.next();
		System.out.print("2번째 선수 이름>> ");
		gamer2.name=scan.next();
		
		while(true)
		{
			gamer1.name_print(gamer1);
			en=scan.nextLine();
			System.out.println(en);
			if(en.isEmpty()) {
			for(int i=0;i<3;i++)
			{
				gamer1.num[i]=(int)(Math.random()*3)+1;
				System.out.print("    "+gamer1.num[i]);
			}
			}
			if(gamer1.num[0]==gamer1.num[1]&&gamer1.num[0]==gamer1.num[2])
			{
				System.out.println("   "+gamer1.name+"님이 이겼습니다!");
				break;
			}
			else
			{
				System.out.println("   아쉽군요!");
			}
			gamer2.name_print(gamer2);
			en=scan.nextLine();
			System.out.println(en);
			if(en.isEmpty())
			{
				for(int i=0;i<3;i++)
			{
				gamer2.num[i]=(int)(Math.random()*3)+1;
				System.out.print("    "+gamer2.num[i]);
			}
			}
			if(gamer1.num[0]==gamer1.num[1]&&gamer1.num[0]==gamer1.num[2])
			{
				System.out.println("   "+gamer2.name+"님이 이겼습니다!");
				break;
			}
			else
			{
				System.out.println("   아쉽군요!");
			}
		
		}
		
	}

}
