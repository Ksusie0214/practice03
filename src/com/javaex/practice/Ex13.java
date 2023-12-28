package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		//아래의 설명에 맞는 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			num=num+i;
		}
		System.out.println("합계: "+num);
	}

}
