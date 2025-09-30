package com.supriya;

public class FourTriangles {

	public static void main(String[] args) {
		//block 1:
		int n=10;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+1-i;j++) {
				System.out.print(" ");
			}
			for(int k =1;k<=i;k++) {
				System.out.print("*");
			}
			
			for(int k=1;k<=n;k++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//block 2:
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(" ");
			}
			for(int k=-1;k<=n;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//block3:
		for(int i =1;i<=n;i++){
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k =1;k<=n+1-i;k++) {
				System.out.print("*");
			}
			for(int k = 1;k<=n;k++) {
				System.out.print(" ");
			}
			for(int k=1;k<=n+1-i;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
