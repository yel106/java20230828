package ch05reference;

public class C08array {

	public static void main(String[] args) {
		// 배열에서 참조값 확인하기. a와 c의 참조값이 같음. 같은 인스턴스 주소값을 참조하는 것.  다른 종이에 주소를 써놨지만 장소는 한군데 
		int[] a= {3, 4, 5 };
		int[] b= {3, 4, 5 };
		int[] c = a;
		
		int code1 = System.identityHashCode(a);
		int code2 = System.identityHashCode(b);
		int code3 = System.identityHashCode(c);
		
		System.out.println(code1); //1554547125
		System.out.println(code2); //617901222
		System.out.println(code3); //1554547125
	
		System.out.println(a[0]); //3
		a[0] = 33;
		System.out.println(a[0]); //33
		System.out.println(c[0]); //33
		System.out.println(b[0]); //3
		
	}

}
