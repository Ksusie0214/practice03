package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		for(int i1 = num; i1>0; i1--) {
			for(int sum = 0; sum<i1; sum++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
