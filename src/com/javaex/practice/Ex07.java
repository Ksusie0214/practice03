package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		//숫자를 입력받아 아래와 같이 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(i=1; i<=num; i++) {
				System.out.print(i);
			}
			
			System.out.println();
			
			
		}
		
		
		sc.close();
		
	} 

}
