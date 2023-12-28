package com.javaex.practice;

public class Ex04 {
	
	public static void main(String[] args) {
		//아래의 출력결과를 예상해서 작성하시오
		
		for(int i=1; i<5; i++) {
			System.out.println(i);
		}
		System.out.println("===========");
		
		for(int i=10; i>0; i=i-2) {
			System.out.println(i);
		}
		//첫번째 for문은 1,2,3,4 가 나오고, 두번째 for문은 10,8,6,4,2가 나온다
	}

}
