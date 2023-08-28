package ch05reference;

public class C04array {

	public static void main(String[] args) {
		int a = 5;
		int b= a;
		
		System.out.println(a); //5
		System.out.println(b); //5

		
		int[] c= {3, 4, 5};  //배열
		int[] d= c;
		System.out.println(c[1]); //4
		System.out.println(d[1]); //4
		
		c[2] = 55;
		
		System.out.println(c[2]); //55
		System.out.println(d[2]); //5가 아닌 55가 나옴. 인스턴스의 값이 나오는 것 
		
		
		
		
	}

}
