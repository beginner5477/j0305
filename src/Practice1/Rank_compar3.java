package Practice1;

//순위 구한후 오름차순으로 출력하시오
public class Rank_compar3 {
	public static void main(String[] args) {
		int[] no = {1, 2, 5, 7, 9};
		int[] n1 = {5, 7, 8, 9, 8};
		int[] rank = new int[n1.length];
		int temp = 0;
		//순위구하기
		for(int i = 0; i < n1.length; i++)
		{
			rank[i] = 1;
			for(int j = 0; j < n1.length; j++)
			{
				if(n1[i] < n1[j]) rank[i]++;
			}
		}
		//출력1
		System.out.println("원본자료 출력");
		for(int i = 0; i < rank.length; i++)
		{
			System.out.println("번호 = " +no[i] + "\t점수 = " + n1[i] + "\t순위 = " + rank[i] + "위");
		}
		//순위순 오름차순 정렬처리
		for(int i = 0; i < no.length - 1; i++)
		{
			for(int j = i + 1; j < no.length; j++)
			{
				if(rank[i] > rank[j]) 
				{
					temp = rank[i]; rank[i] = rank[j]; rank[j] = temp;
					temp = n1[i]; n1[i] = n1[j]; n1[j] = temp;
					temp = no[i]; no[i] = no[j]; no[j] = temp;
				}
			}
		}
		//출력2
		System.out.println("오름차순으로 정렬하기");
		for(int i = 0; i < rank.length; i++)
		{
			System.out.println("번호 = " +no[i] + "\t점수 = " + n1[i] + "\t순위 = " + rank[i] + "위");
		}
		
	}
}
