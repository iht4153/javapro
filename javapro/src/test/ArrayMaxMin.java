package test;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxMin {
	public static void main(String[] arg) {
		
		
		int[] s = new int[5];
		
		System.out.println("정수 5개를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<s.length; i++) {
			s[i] = sc.nextInt();
		}
		
		int max = s[0];
		int min = s[0];
		
		for(int i=1; i<s.length; i++) {
			if(max < s[i]) max = s[i];
			if(min > s[i]) min = s[i];
		}
		
		
		Arrays.sort(s);	//   오름차순 정렬
		
		for(int i : s) {
			System.out.print(i+"\t");
		}
		sc.close();
		
		System.out.println();
		System.out.println("max : "+ max);
		System.out.println("min : "+ min);
	}
}
		
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();
//		int n4 = sc.nextInt();
//		int n5 = sc.nextInt();
//		
//		int[] n = {n1, n2, n3, n4, n5};
//		
////		int[0] = n1;
//		
//		System.out.println("정수 "+n1+", "+n2+", "+n3+", "+n4+", "+n5+"가 입력되었습니다.");
//		
//		int max, min;
//		
//		max = (n1 > n2) ? n1 : n2;
//		max = (n2 > n3) ? n2 : n3;
//		max = (n3 > n4) ? n3 : n4;
//		max = (n4 > n5) ? n4 : n5;
//		max = (n5 > max) ? n5 : max;
//		
////		min = (n1 < n2) ? n1 : n2;
//		min = (n2 < n3) ? n2 : n3;
//		min = (n3 < n4) ? n3 : n4;
//		min = (n4 < n5) ? n4 : n5;
//		min = (n5 < min) ? n5 : min;
		
//	}
//}
