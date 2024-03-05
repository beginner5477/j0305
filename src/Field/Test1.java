package Field;

// 지역변수 로컬변수 전역변수 필드 구분
public class Test1 {
	int n3 = 10;
	public  void atom() {
		int n1 = 100;
		
		for(int i = 0; i < 5; i++)
		{
			int n2 = 200 * i;
			System.out.println(n1 + n2);
		}
		n3 += n1;
		System.out.println(n3);
	}
}
