package ch05reference;

public class C09method {

	public static void main(String[] args) {
		//기본형
		int a = 5;
		method1(a); //변수 a가 갖고 있는 값 5가 int p에 전달 되고 p가 출력됨
		
		
		int b= 50;
		method1(b);
		

	}
	
	public static void method1(int p) {
		System.out.println(p);
	}

}
