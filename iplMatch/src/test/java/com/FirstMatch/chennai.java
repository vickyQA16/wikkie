package com.FirstMatch;

import java.util.Scanner;

public class chennai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base length");
		int base = sc.nextInt();
		
		for (int i = base; i >=1 ; i--) {
			
			for (int j = 1; j <= i*2; j++) {
				System.out.print(" ");
			}
			
			for (int j = i; j <= base; j++) {
				System.out.print(j+" ");
			}
			for (int j = base-1; j >=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	



	}


