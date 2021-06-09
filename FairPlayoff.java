package codeForces;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class FairPlayoff {
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
 		   int s1=s.nextInt();
 		   int s2=s.nextInt();
 		   int s3=s.nextInt();
 		   int s4=s.nextInt();
 		   int a1=Math.max(s1, s2);
 		   int a2=Math.max(s3, s4);
 		   int b1=Math.min(s1, s2);
 		   int b2=Math.min(s3, s4);
 		   if(a1>b2&& a2>b1)
 			   System.out.println("yes");
 		   else
 			   System.out.println("no");
 	   }
		 }
		 catch(Exception e)
		 {
			 return;
		 }
	}

}
