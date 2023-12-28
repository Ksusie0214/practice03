package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for(int i = 1; i<= num; i++) {
			i=i+2;
		}
		System.out.println("결과값: "+num);
		sc.close();
	}

}
