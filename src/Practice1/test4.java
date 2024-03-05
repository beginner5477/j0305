package Practice1;

//bubble sort 정렬법
public class test4 {
	public static void main(String[] args) {
		int[] m = {1, 3, 2, 4, 9, 5};
		int temp = 0;
		
		System.out.println("원본자료:");
		for(int i = 0; i < 6; i++)
		{
			System.out.print(m[i]);
		}
		System.out.println();
		
		for(int i = 0; i < 6; i++)
		{
			for(int j = 0; j < 6 - i; j++)
			{
				if(m[j] > m[j + 1])
				{
					temp = m[j];
					m[j] = m[j + 1];
					m[j + 1] = temp;
				}
			}
		}
		System.out.println("정렬자료:");
		for(int i = 0; i < 6; i++)
		{
			System.out.print(m[i]);
		}
	}
}
