package chap03;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요.");
		int score = sc.nextInt();
		if ((score>=90) && (score<100)) {
			System.out.println("A학점 입니다.");
		} else if ((score<90) && (score >=80)) {
			System.out.println("B학점 입니다.");
		} else if ((score<80) && (score >=70)) {
			System.out.println("C학점 입니다.");
		} else if ((score<70) && (score>=60)) {
			System.out.println("D학점 입니다.");
		} else if (score < 60){
			System.out.println("F학점 입니다.");
		} else {
			System.out.println("0~100 사이의 점수만 입력해 주세요.");
		}
		
	}

}
