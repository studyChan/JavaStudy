package chap02;

public class Sample01 {
	public static void main(String[] args) {
		char chr = 'A';
		System.out.println("char : "+ chr); //문자 그대로 출력.
		System.out.println("Encoding : "+(int)chr); // chr 변수를 아스키코드로 인코딩.
		System.out.println("Decoding : "+(char)65); // 아스키코드 65 롤 디코딩.
	}
}
