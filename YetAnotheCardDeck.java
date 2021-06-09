package codeForces;
import java.util.*;
public class YetAnotheCardDeck {
/*
 * INPUT:   7 5
			2 1 1 4 3 3 1
			3 2 1 1 4
   OUTPUT:  5 2 3 1 5 
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		LinkedList<Integer>a=new LinkedList<>();
		int[] t=new int[q];
		for(int i=0;i<n;i++)
			a.add(sc.nextInt());
//		for(int j=0;j<q;j++)
//			t[j]=sc.nextInt();
		for(int i=0;i<q;i++)
		{
			t[i]=sc.nextInt();
			int num=t[i];
			for(int j=0;j<n;j++)
			{
				if(num==a.get(j))
				{
				System.out.print(j+1+" ");
				a.remove(j);
				a.add(0,num);
				break;
				}
			}
		}
	}
}

