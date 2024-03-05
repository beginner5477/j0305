package Practice1;

//240304과제 리뷰하기 369게임 출력프로그램 배열을 이용했음
public class Test1 {
	public static void main(String[] args) {
		String[] num = new String[100];
		int sw = 0;
		String temp;
		
		for(int i = 0; i < num.length; i++)
		{
			num[i] = (i + 1) + "";
			temp = "";
			sw = 0;
			for(int j = 0; j < num[i].length(); j++)
			{
				if(num[i].charAt(j) == '3' || num[i].charAt(j) == '6' || num[i].charAt(j) == '9') 
				{
					temp += "짝";
					sw = 1;
				}
			}
			if(sw == 1) num[i] = temp;
		}
		for(int i = 0; i < num.length; i++)
		{
			System.out.print(num[i] + "\t");
			if((i + 1) % 10 == 0) System.out.println();
		}
	}
}
