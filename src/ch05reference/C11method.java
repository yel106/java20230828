package ch05reference;

public class C11method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = method1();  //참조값만 가지고 있음
		
		System.out.println("main 메소드");
		System.out.println(System.identityHashCode(a));

	}

	public static int[] method1() {
		int[] c = {9, 7, 5}; //새배열을 만들고 리턴해줌 
		
		
		System.out.println("method1 내부");
		System.out.println(System.identityHashCode(c));
		
		
		return c; //이떄 9 , 7, 5를 리턴하는게 아니라 그 인스턴스의 주소값을 리턴함
		
	}
}
