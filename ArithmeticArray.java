package codeForces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class ArithmeticArray {
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
        long nextLong() { return Long.parseLong(next()); }
   }
	public static void main(String[] args) {
	try{
		 FastReader s = new FastReader();
   	   int t=s.nextInt();
   	   for(int tc=0;tc<t;tc++) 
   	   {
   		   int n=s.nextInt();
   		   int sum=0;
   		  ArrayList<Integer> a=new ArrayList<>();
   		  for(int i=0;i<n;i++)
   		  { 
   			  a.add(s.nextInt());
   			  sum+=a.get(i);
   		  }
   		if(sum<n)
 			  System.out.println(1);
   		  else if(sum==n)
   			  System.out.println(0); 
   		  else
   			  System.out.println(sum-n); 
   	   }
	}
	catch(Exception e)
	{return ;}
    }
}
