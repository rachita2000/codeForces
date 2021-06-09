package codeForces;
import java.util.*;
public class GDCLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int x,y;
			x=(int)Math.pow(10, c-1);
			y=(int)Math.pow(10,c-1);
			while(x<(int)Math.pow(10, a-1))
				x=x*2;
			while(y<(int)Math.pow(10, b-1))
				y=y*3;
			
			System.out.println(x+" "+y);
		}
	}

}
