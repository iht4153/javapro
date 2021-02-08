package test;

import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		int n1, n2, n3, max, min;
		System.out.println("정수 3개를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		max = (n1 > n2) ? n1 : n2;
		max = (n3 > max) ? n3 : max;
		min = (n1 < n2) ? n1 : n2;
		min = (n3 < min) ? n3 : min;
		
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}
}
