package codeForces;

import java.util.Scanner;

public class ReviewSite1551A {
/* INPUT:
  	4
	1
	2
	3
	1 2 3
	5
	1 1 1 1 1
	3
	3 3 2
	OUTPUT:
	0
	2
	5
	2
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int v;
			int t1=0;
			int t2=0;
			int t3=0;
			for(int j=0;j<n;j++)
			{
				v=sc.nextInt();
			
			
			if(v==1)
				t1++;
			else if(v==2)
				t2++;
			else if(v==3) 
				t3++;
			}
			t1=t1+t3;
			System.out.println(t1);
		}


	}

}
