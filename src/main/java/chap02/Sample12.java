package chap02;

import java.util.Scanner;

public class Sample12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("int 자료형을 입력하세요 : ");
		int a = sc.nextInt(); // 스캐너로부터 입력받은 int값 저장.
		
		System.out.print("char 자료형을 입력하세요 : ");
		char b = sc.next().charAt(0); // 첫 문자만 받아온다.
		
		System.out.print("long 자료형을 입력하세요 : ");
		long c = sc.nextLong(); // 스캐너로부터 입력받은 long값 저장.
		
		System.out.print("double 자료형을 입력하세요 : ");
		double d = sc.nextDouble();
		
		System.out.print("String 자료형을 입력하세요 : ");
		String e = sc.next();
		
		System.out.print("");
		
		System.out.print("int : "+a);
		System.out.print("char : "+b);
		System.out.print("long : "+c);
		System.out.print("double : "+d);
		System.out.print("String : "+ e);
		
		sc.close();
	}

}
