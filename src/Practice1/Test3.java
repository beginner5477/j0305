package Practice1;

//selection sort 정렬법
public class Test3 {
	public static void main(String[] args) {
		int[] m = {5, 2, 6, 7, 9, 8};
		int temp = 0;
		System.out.println("원본 배열값");
		for(int i = 0; i < m.length; i++)
		{
			System.out.print(m[i] + "");
		}
		for(int i = 0; i < 6; i++)
		{
			for(int j = i + 1; j < 6; j++)
			{
				if(m[i] > m[j])
				{
					temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			}
		}
		System.out.println("정렬된 배열값");
		for(int i = 0; i < m.length; i++)
		{
			System.out.print(m[i] + "");
		}
		
	}
}
