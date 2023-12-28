package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {
		//아래와 같이 구구단을 출력하시오
		
		for(int sum=1; sum<=9; sum++) {
			for(int i=2; i<=9; i++) {
				int result=sum*i;
				System.out.print(i+" * "+sum+" = "+result);
			}
			System.out.println();
		}
	}

}
