package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		
		System.out.println("===========================");
		System.out.println("   [숫자맞추기게임 시작]    ");
		System.out.println("===========================");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(">> ");
			int num=sc.nextInt();
			if(num>50) {System.out.println("더 낮게");}
			else {
				if(num<50) {System.out.println("더 높게");}
			
				if(num==50) {
					System.out.println("맞았습니다.");
					System.out.println("게임을 종료하시겠습니까?(y/n) >>");
					String yes = sc.nextLine();
					switch (yes) {
						case "y" : {
							System.out.println("=====================");
							System.out.println("   [숫자맞추기게임 종료]   ");
							System.out.println("======================"); break;}
						default : {continue;}
					}
			
				}
			}

		}
		sc.close();
	}

}
