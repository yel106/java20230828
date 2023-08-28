package ch05reference;

public class C07reference {

	public static void main(String[] args) {
		// a와 c는 참조값이 같고 b는 참조값이 다르다는 것을 알수 있음 . 참조값을 볼 수 있는 방법
		String a= "java";
		String b= "spring";
		String c = a;
		
		int code1 = System.identityHashCode(a);
		int code2 = System.identityHashCode(b);
		int code3 = System.identityHashCode(c);
		
		System.out.println(code1); //1554547125
		System.out.println(code2); //617901222
		System.out.println(code3); //1554547125

		
	}

}
