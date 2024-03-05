package Practice1;

//배열 복사: System.arrayCopy(원본배열명,원본배열시작인덱스번호, 타겟배열명, 타겟배열시작인덱스, 복사할 원소갯수)
public class Arraycopy {
	public static void main(String[] args) {
		int[] n1 = {1, 3, 5, 7, 9};
		int[] n2 = new int[n1.length];
		System.out.println("n1: ");
		for(int i = 0; i < n1.length; i++)
		{
			System.out.print(n1[i] + " / ");
		}
		System.out.println();
		for(int i = 0; i < n1.length; i++)
		{
			System.out.print(n2[i] + " / ");
		}
		System.out.println();
		System.arraycopy(n1, 0, n2, 0, 5);
		for(int i = 0; i < n1.length; i++)
		{
			System.out.print(n2[i] + " / ");
		}
		n1[3] = 500;
		System.out.println();
		for(int i = 0; i < n1.length; i++)
		{
			System.out.print(n1[i] + " / ");
		}
		System.out.println();
		for(int i = 0; i < n1.length; i++)
		{
			System.out.print(n2[i] + " / ");
		}
	}
}
