package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		
		int sum = 0;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택>");
			int num = sc.nextInt();
				switch(num) {
				case 1 : {System.out.println("예금액>");
				sum=sum+sc.nextInt(); break;}
				case 2 : {System.out.println("출금액>");
				sum=sum-sc.nextInt(); break;}
				case 3 : {System.out.println("잔고액>");
				System.out.println(sum); break;}
				case 4 : {run=false;
					break;}
				default :{System.out.println("다시 입력해주세요"); break;}
				
				}//switch
		}//while
		System.out.println("프로그램 종료");
		sc.close();
	}

}
