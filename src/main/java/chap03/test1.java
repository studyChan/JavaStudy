package chap03;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result = (num1 > num2) ? num1 : (num1 == num2) ? 0 : num2;
		System.out.printf("결과 : %d",result);
	}

}
