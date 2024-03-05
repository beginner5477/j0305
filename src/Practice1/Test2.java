package Practice1;

import java.util.Scanner;

//가위바위보 게임 만들기
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			String comans = "";
			int computer = (int)(Math.random() * 3) + 1; // 1:가위 2.바위 3.보
			switch (computer)
			{
				case 1:
					comans = "가위";
					break;
				case 2:
					comans = "바위";
					break;
				case 3:
					comans = "보";
					break;
			}
			int na;
			System.out.print(" 1:가위 2.바위 3.보 중하나를 입력하쇼(0:그만)~");
			na = sc.nextInt();
			if(na == 0) break;
			else if(na == 1 || na == 2 || na ==3)
			{
				int temp = na - computer;
				if(temp == 0) System.out.println("비겼다.");
				else if(temp == 1 || temp == -2) System.out.println("이겼다.");
				else System.out.println("졌다.");
				System.out.println("컴퓨터가 낸것은 " + comans);
			}
			else System.out.println("잘못 입력하셨습니다. 다시시작~");
		}
		sc.close();
	}
}
