package chap03;
import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력하세요");
		int num1 = sc.nextInt();
		if(num1>0) {
			System.out.printf("출력값은 : %d",num1);
		} else {
			num1 = num1 * -1;
			System.out.printf("출력값은 : %d",num1);
		}
	}

}
