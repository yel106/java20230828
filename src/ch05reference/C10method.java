package ch05reference;

public class C10method {

	public static void main(String[] args) {
		// 배열. 다른종이에 같은 주소를 쓴거라 같게 나옴 
		int[] a = {3, 4, 5};    // 배열은 3, 4, 5라는 인스턴스의 주소만 갖고있는것
		
		System.out.println("main 메소드");
		System.out.println(System.identityHashCode(a)); //참조값을 확인하기 
		
		System.out.println(a[0]);
		method1(a);    //참조값이 전달되는것
		
		
		System.out.println("메소드 호출후");
		System.out.println(a[0]); //3? 33?  a는 p로 참조값만 전달되기 떄문에 p[0] = 33으로 바꾸면 33이 나오는것 

	}
	public static void method1(int[] p) {
		System.out.println("method1 메소드");
		System.out.println(System.identityHashCode(p));
		System.out.println(p[0]);
		
		p[0] = 33; //33으로 바꾸면?
		
	}

}
