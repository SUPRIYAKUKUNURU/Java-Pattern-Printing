package com.supriya;

public class Home {

	public static void main(String[] args) {
		int n=10;
		for(int i= 1;i<=n;i++) {
			for(int j = 1;j<=n+1-i;j++) {
				System.out.print(" ");
			}
			for(int k =1;k<=i;k++) {
				System.out.print("*");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			System.out.print(" ");
			for(int j=1;j<=n;j++) {
				System.out.print("*");
		}
		
			for(int k=1;k<=n;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
