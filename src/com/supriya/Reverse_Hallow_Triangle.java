package com.supriya;

public class Reverse_Hallow_Triangle {
	public static void main(String[]args) {
		int n =5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+1-i;j++) {
				if(i==1 || j==1 ||i+j==n+1) {
					System.out.print("*");
					
				}else {
				System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
