package codeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class ArrayReordering {
	static int gcd(int a,int b)
	{
		if(b==0) return a;
		return gcd(b,a%b);
	}
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
	   }
	public static void main(String[] args) {
		try {
			 FastReader s = new FastReader();
 	   int t=s.nextInt();
 	   
 	   for(int tc=0;tc<t;tc++) 
 	   {
 		   int count=0;
 		   int n=s.nextInt();
 		   int[] arr=new int[n];
 		   ArrayList<Integer> even=new ArrayList<>();
 		  ArrayList<Integer> odd=new ArrayList<>();
 		  
 		  for(int i=0;i<n;i++)
 		  { 
 			  arr[i]=s.nextInt();
 		  
 			  if((arr[i]&1)==0)
 				  even.add(arr[i]);
 			  else
 				  odd.add(arr[i]);
 		  }
 		  Collections.reverse(odd);
 		  even.addAll(odd);
 		  for(int i=0;i<n;i++)
 		  {
 			  for(int j=i+1;j<n;j++)
 			  {if(gcd(even.get(i),2*even.get(j))>1)
 				  count++;
 			  }
 		  }
 		  System.out.println(count);
 	   }
		}
 	   catch(Exception e)
 	   {return;}
}
}
