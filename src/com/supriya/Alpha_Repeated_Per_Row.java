package com.supriya;

public class Alpha_Repeated_Per_Row {

	public static void main(String[] args) {
		int n= 10;
		for(int i=1;i<=n;i++) {
			char ch = (char)('A'+i-1);
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}

	}

}
