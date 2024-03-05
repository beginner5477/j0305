package Practice1;

// 1~45의 숫자중에 6개를 뽑아 중복허용
public class Lotto {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		//6개의 숫자를 임의로 뽑아서 배열에 저장
		for(int i = 0; i < lotto.length; i++)
		{
			int n1 = (int)(Math.random() * 45) + 1;
			lotto[i] = n1;
		}
		//6개의 로또번호를 오름차순으로 정렬시키기
		int temp = 0;
		for(int i = 0; i < 6; i++)
		{
			for(int j = i + 1; j < 6; j++)
			{
				if(lotto[i] > lotto[j])
				{
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		for(int i = 0; i < 6; i++)
		{
			System.out.println(lotto[i]);
		}
	}
}
