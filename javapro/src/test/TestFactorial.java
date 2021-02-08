package test;

import java.util.Scanner;

public class TestFactorial {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		factorial();
		
	}
	
	//팩토리얼 계산기
	public static void factorial() {
		System.out.println("팩토리얼을 구할 정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		System.out.println("팩토리얼 숫자 입력 :: [" + num + "]");
		
		//팩토리얼 계산
		int Tot = 1;
		for(int i=num; i>0; i--) {
//			System.out.println("팩토리얼 계산 :: [" + Tot + "] = [" + Tot + "] * [" + i + "]");
			Tot = Tot * i;
			
		}
		System.out.println(num + "의 팩토리얼은 : " + Tot + "입니다.");
	}
}