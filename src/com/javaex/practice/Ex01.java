package com.javaex.practice;

public class Ex01 {
	public static void main(String[] args) {
		//아래의 출력결과를 예상해서 작성하시오
		
		System.out.println("While 문");
		int index = 0;
		while(index<3) {
			System.out.println("index=" + index);
			index++;
		}//0, 1, 2 가 출력된다
		
		System.out.println("for문");
		for(int order=0; order<3; order++) {
			System.out.println("order= "+ order);
		}//0, 1, 2 가 출력된다
		
	}
}
