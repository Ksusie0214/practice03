package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("---------------------------");
		System.out.print("선택>");
		int num = sc.nextInt();
		if(num==1) {
			System.out.println("예금액> ");
			int money = sc.nextInt();
			System.out.println("선택>");
			int num2 = sc.nextInt();
			if(num2==2) {
				System.out.println("출금액> ");
				int minus = sc.nextInt();
				System.out.println("선택> ");
				int num3 = sc.nextInt();
				if(num3==3) {
					int save = money-minus;
					System.out.print("잔고액> "+save);
				
					
				}
			}
		}
		else if(num==4) {
			System.out.println("프로그램 종료");
		}
		else {
			System.out.println("다시 입력해주세요");
		}
		sc.close();
	}

}
