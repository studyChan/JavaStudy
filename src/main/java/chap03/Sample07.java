package chap03;

public class Sample07 {

	public static void main(String[] args) {
		/* 논리곱 */ //둘다 참일 경우 true
		System.out.println("* 논리곱 &");
		System.out.println(1==1 & 2==3);
		System.out.println(1>2 & 4< 2);
		System.out.println(1<2 & 4> 2);
		
		/* 논리합 */ // 한쪽이라도 참일 경우 true
		System.out.println("* 논리합 |");
		System.out.println(1==1 | 2==3);
		System.out.println(1>2 | 4<2);
		System.out.println(1<2 | 4>2);
		
		/* 배타논리합 */ //한쪽만 거짓이면 true
		System.out.println("* 배타논리합 ^");
		System.out.println(1==1 ^ 2==3);
		System.out.println(1>2 ^ 4<2);
		System.out.println(1<2 ^ 4>2);
		
		/* 논리부정 */ // 거짓이 아니면 true
		System.out.println("* 논리부정 !");
		System.out.println(!(1==1));
		System.out.println(!(1>2));
	}

}
