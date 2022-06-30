package com.test.exam02;

import java.util.Arrays;

import java.util.Scanner;

public class ArrayExam {
	
	@SuppressWarnings("resource")
	public static void main(String[]argv) {
		
		int [] a = new int[] {1,2,3,4,5,6};
		
		for(int i=0; i<a.length; i++) 
					//배열의 길이
			System.out.print(a[i] + " ");
		
		System.out.println("\n");
		
		for(int i : a) System.out.print(i + " ");
		//향상된 for문 배열출력용입력용으로 많이 사용함
		//배열의 각각의 아이템 변수를 써주고 배열의 이름을 써주면 루핑됨
		
		System.out.println("\n");
		
		System.out.println(Arrays.toString(a));
							
		//2차원
		int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
		
			for(int j =0; j<3; j++)
				for(int i = 0; i<3; i++) {
					System.out.print(b[i][j]);
				}
			
		for(int i = 0; i<b.length;i++)
			System.out.println(Arrays.toString(b[i]));
											//b의 배열을 가르키고 있음 즉, int[][]b = {{x},{y},{z}}
											//[1,2,3}={x}, {4,5,6}={y}, {7,8,9}={z}
											//최상의 배열로 표시됨	
			
		int c = 6;
		if(c < 5) System.out.println("작다");
			else if(c > 3 ) System.out.println("크다");
				else if(c < 0) System.out.println("땡");
		
		
		int d = 0;
		Scanner put = new Scanner(System.in);
			System.out.println("5이하의 숫자를 입력하세요 : ");
			d = put.nextInt();
		
		switch(d) {
		case 1 : System.out.println("1입니다.");
			break;
		case 2: System.out.println("2입니다.");
			break;
		case 3: System.out.println("3입니다.");
			break;
		default : System.out.println("5입니다.");
		}
		
		String str = "Hello";
		switch(str) {
		case "hi" : System.out.println("what?");
			break;
		default : System.out.println("Hi.");
		
		}
		
		int k = 0;
		int s = 0;
		while(true) {
			
			k++;
			s = s+k;
			if(k == 100)
				continue;
			else if(k > 100)
				break;
			
	
		}
		System.out.println("s = " +s);
		
		int sum = 0;
		for(int i=0;i<=100;i++)
			sum =sum+ i;
			System.out.println(sum);
		
		
		

	}
	
}


