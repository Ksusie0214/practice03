package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 0; i<=num; i++) {
			sum=sum+i;
			if(i==num) {
				System.out.println(i);
			}else {
				System.out.print(i+"+");
			}
		}
		System.out.println("합계: "+sum);
		sc.close();
	}

}
