package com.supriya;

public class Universal_Alphabetics {

	public static void main(String[] args) {
		
//		int n = 20;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i == 1|| i==n || j==1|| j==n || i==n/2 || j==n/2 || i==j || i+j==n+1 || i==n/4 || j==n/4 ||i==(3*n)/4 ||j==(3*n)/4) {
//				System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		or Practice

		int n =30;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j == 1 || j== n ||i == n/2 || j== n/2 || i== j || i+j == n+1 || i==n/4 ||
						i==(3*n)/4 || j==n/4 || j==(3*n)/4 ||i+j ==(n/2)+1 || i-j ==n/2 || j-i ==n/2 || i+j == (3*n/2)+1){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}

}
