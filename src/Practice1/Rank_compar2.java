package Practice1;

//랭킹 구하기 점수 입력받아서 selection sort 쓰기
public class Rank_compar2 {
	public static void main(String[] args) {
		int[] n1 = {5, 7, 10, 9, 8};
		int[] rank = new int[n1.length];
		//순위구하기
		for(int i = 0; i < n1.length; i++)
		{
			rank[i] = 1;
			for(int j = 0; j < n1.length; j++)
			{
				if(n1[i] < n1[j]) rank[i]++;
			}
		}
		for(int i = 0; i < rank.length; i++)
		{
			System.out.println("점수 = " + n1[i] + "순위 = " + rank[i]);
		}
	}
}
