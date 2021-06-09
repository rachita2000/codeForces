package codeForces;

import java.util.Scanner;

public class AndThenThereWereK {
	public static int answer (int n ,int k)
	{
		int s=n&k;
		if(s==0)
			return k;
		else {
			n=s;
			k--;
		return answer (n,k);
	}
	}
	public static void main(String[] args) throws java.lang.Exception
	{
		try {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int k=n-1;
			System.out.println(answer(n,k));
		}
	}
	catch(Exception e)
	{
		return;
	}
		}
}
