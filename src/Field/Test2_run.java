package Field;

public class Test2_run {
	public static void main(String[] args) {
		Test2 t1 = new Test2();
		System.out.println(t1.n1);
		System.out.println(t1.n2);
		System.out.println(t1.d1);
		System.out.println(t1.d2);
		System.out.println(t1.l1);
		System.out.println(t1.l2);
		Test3 t2 = new Test3();
		System.out.println(t2.name);
		Test3 t3 = new Test3();
		System.out.println(t3.name);
		t3.name = "킴도완";
		System.out.println(t3.name);
	}
}
