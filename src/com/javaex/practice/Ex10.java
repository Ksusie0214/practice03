package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		//정수 다섯개를 입력받아 가장 큰 수를 출력하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int max = 0;
		for(int i = 0; i<5;i++) {
			System.out.println("숫자: ");
			int num = sc.nextInt();
			if(max<num) {
				max=num;
			}
			
			
			
		}
		System.out.println("최대값은 "+ max + "입니다.");
		
		
		
		sc.close();
	}

}
