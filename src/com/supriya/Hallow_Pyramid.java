package com.supriya;

public class Hallow_Pyramid {

	public static void main(String[] args) {
		int n =10;
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n||i+j==(n/2)+1 || i-j ==n/2 || j-i ==n/2 || i+j ==(3*n)/2+1)  {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
