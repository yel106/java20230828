package ch05reference;

public class C05array {

	public static void main(String[] args) {
		int[] a = {3,4, 5};
		int[] b = a;
		
		System.out.println(b[2]); //5
		
		a[2] = 7; //7     배열의 2번째를 7로 바꾸면 7이 나옴
		
		
		int[] c= {10, 20, 30};
		int[] d= {10, 20, 30};
		
		System.out.println(d[2]); //30
		
		c[2]= 90;
		System.out.println(c[2]); //90
		System.out.println(d[2]); //30? 90?
		

	}

}
