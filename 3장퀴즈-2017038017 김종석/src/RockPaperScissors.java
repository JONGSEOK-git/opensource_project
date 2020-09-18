import java.util.Scanner;
public class RockPaperScissors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String com[]= {"가위", "바위", "보"};
		String rps;
		int num=0;
		double randomValue=Math.random();
		
		while(true)
		{
			System.out.println("컴퓨터와 가위 바위 보게임을 합니다.");
			System.out.print("가위 바위 보!>>");
			rps=scan.nextLine();
			
			num=(int)(randomValue*3);
			
			switch(rps)
			{
				case "가위" :
					switch(com[num])
					{
						case "가위" :
							System.out.println("사용자="+rps+" 컴퓨터="+com[num]+", 비겼습니다.");
							continue;
						case "바위":
							System.out.println("사용자="+rps+" 컴퓨터="+com[num]+", 사용자가 졌습니다.");
							continue;
						case "보" :
							System.out.println("사용자="+rps+" 컴퓨터="+com[num]+", 사용자가 이겼습니다.");
							continue;
					}
				case "바위" :
					switch(com[num])
					{
						case "가위" :
							System.out.println("사용자="+rps+" 컴퓨터="+com[num]+", 사용자가 이겼습니다.");
							continue;
						case "바위":
							System.out.println("사용자="+rps+" 컴퓨터="+com[num]+", 비겼습니다.");
							continue;
						case "보" :
							System.out.println("사용자="+rps+" 컴퓨터="+com[num]+", 사용자가 졌습니다.");
							continue;
					}
				case "보" :
					switch(com[num])
					{
						case "가위" :
							System.out.println("사용자="+rps+" 컴퓨터="+com[num]+", 사용자가 졌습니다.");
							continue;
						case "바위":
							System.out.println("사용자="+rps+" 컴퓨터="+com[num]+", 사용자가 이겼습니다.");
							continue;
						case "보" :
							System.out.println("사용자="+rps+" 컴퓨터="+com[num]+", 비겼습니다.");
							continue;
					}
				case "그만" :
					System.out.println("게임을 그만합니다.");
					System.exit(0);
			}
		}
	}

}
