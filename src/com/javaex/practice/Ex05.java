package com.javaex.practice;

public class Ex05 {
	public static void main(String[] args) {
		//아래의 출력결과를 예상하여 작성하시오
		
		int i=1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {flag=false;}	
			System.out.println(i);
			i=i+1;
		}
	
		
		//i는 1씩 늘어나고 i가 5이상이 되면 flag 변수가 거짓이 되기 때문에
		//시스템 상으로는 1,2,3,4가 출력된다.
		
		
	}

}
