package com.supriya;

public class Eagle {

	public static void main(String[] args) {
		
		int n = 10;
		
//		block 1:
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+1-i;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			
			for(int j =1;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=n+1-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n+1-i;j++) {
				System.out.print(" ");
			}
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j =1;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		block 2:
		
		for(int i =1;i<=n;i++){
			for(int j=1;j<= n;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=n+1-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			for(int j =1;j<=n;j++) {
				System.out.print("*");
			}
			for(int j =1;j<=n+1-i;j++) {
				System.out.print(" ");
			}
			
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
//			
     		for(int j=1;j<=n;j++) {
     			System.out.print("*");
     		}
			System.out.println();
		}
		
//		block 3:
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=n;j++) {
				
				System.out.print("*");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		block 4:
	 for(int i=1;i<=n;i++) {
		 for(int j =1;j<=n;j++) {
			 System.out.print("*");
		 }
		 for(int j=1;j<=n+1-i;j++) {
			 System.out.print("*");
		 }
		 for(int j=1;j<=i;j++) {
			 System.out.print(" ");
		 }
		 for(int j=1;j<=i;j++) {
			 System.out.print(" ");
		 }
		 for(int j=1;j<=n+1-i;j++) {
			 System.out.print("*");
		 }
		 for(int j=1;j<=n+1-i;j++) {
			 System.out.print("*");
		 }
		 for(int j=1;j<=i;j++) {
			 System.out.print(" ");
		 }
		 for(int j=1;j<=i;j++) {
			 System.out.print(" ");
		 }
		 for(int j=1;j<=n+1-i;j++) {
			 System.out.print("*");
		 }
		 for(int j=1;j<=n;j++) {
			 System.out.print("*");
		 }
		 
		 System.out.println();
	 }
//	 block 5:
	 for(int i =1;i<=n;i++) {
		 for(int j=1;j<=i;j++) {
			 System.out.print(" ");
		 }
		 for(int j=1;j<=n+1-i;j++) {
			 System.out.print("*");
		 }
		 for(int j=1;j<=n;j++) {
			 System.out.print(" ");
		 }
		 for(int j=1;j<=n;j++) {
			 System.out.print(" ");
		 }
		 for(int j=1;j<=n;j++) {
			 System.out.print(" ");
		 }
		 for(int j=1;j<=n;j++) {
			 System.out.print(" ");
		 }
		 for(int j=1;j<=n+1-i;j++) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	}

}
