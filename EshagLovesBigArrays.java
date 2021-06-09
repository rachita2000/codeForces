package codeForces;
import java.util.*;
import java.io.*;
import java.lang.*;
public class EshagLovesBigArrays {
    public static void main(String[] args)  throws java.lang.Exception
    {
    	try {
    	Scanner sc=new Scanner (System.in);
    	int t=sc.nextInt();
    	for(int i=0;i<t;i++)
    	{
    	ArrayList<Integer> a=new ArrayList<>();
    	int n=sc.nextInt();
    	int count=0;
    	int f=0,s=0;
    	for(int j=0;j<n;j++) {
		a.add(sc.nextInt());
		}
    	Collections.sort(a);
    	f=a.get(0);
    	boolean mila=false;
    	for(int j=0;j<a.size()-1;j++)
    	{
    		if(a.get(j)>f)
    		{
    			
    			s=a.get(j);
    			mila=true;
    			break;
    		}
    	}
    	if(mila==false) {
    		s=a.get(0);
    	}
    	int avg=(f+s)/2;
    	for(int j=0;j<a.size();j++)
    	{
    	if(a.get(j)>avg)
    		count++;
    	}
    	System.out.println(count);
    }
   }
    	catch(Exception e)
    	{return;}
    }  
}
