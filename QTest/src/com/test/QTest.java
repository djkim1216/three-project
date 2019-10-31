package com.test;

public class QTest {
	public static void main(String[] args) {
		System.out.println("안녕 여러분");
		
		System.out.println("넴 넨");
		
		for(int i =2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n", i,j,i*j);
			}
			System.out.println();
		}
	}

}
