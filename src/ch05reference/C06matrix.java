package ch05reference;

public class C06matrix {

	public static void main(String[] args) {
		//2차원 배열
		int[][] a = {{1,2,3}, {10 ,20, 30}, {100, 200, 300} };
		int[][] b= a;  //a의 타입은 [][]니까 b도 똑같이 [][]를 넣어줘야함
		
		System.out.println(a[0][2]); //3
		System.out.println(b[0][2]); //3
		
		a[1][1] = 2000;
		System.out.println(a[1][1]); //2000
		System.out.println(b[1][1]); //20? 2000 ?
		
		b[2][2] = 9999;
		System.out.println(b[2][2]); //9999
		System.out.println(a[2][2]); //9999
		
		b[2] = new int[] {111, 222, 333};
		System.out.println(b[2][2]); //333
		System.out.println(a[2][2]); //333
		//여기까지는 a,b가 같은 객체였음

		//b에 새객체(instance)의 참조값이 할당됨
		b = new int[][] { {33, 44}, {22, 11} };  //b가 다른 값을 가지게됨
		System.out.println(b[0][0]); //33
		System.out.println(a[0][0]); //33? 1? . 1이 나옴 
		
	}

}
