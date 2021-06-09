package codeForces;
import java.util.*;

public class Random {
	
	 public static boolean checkZeroOnes(String s) {
		 boolean ans=false;
		 int c1=0,c0=0;
	      for(int i=0;i<s.length()-1;i++)
	      { c1=0;c0=0;
	    	  if(s.charAt(i)=='1' && s.charAt(i+1)=='1')
	    		  c1++;
	    	  
	    	  else if(s.charAt(i)=='0' && s.charAt(i+1)=='0')
	    		  c0++; 
	    	  System.out.println(c1);
	    	  System.out.println(c0);
	    	  if(c0<c1)
	    		  ans=true;
	    	  else
		      ans=false;
	    		  
	      }
	      
	      return ans;
	    }
	public static void main(String[] args ) {
	Scanner sc=new Scanner (System.in);
	String s=sc.nextLine();
	System.out.println(checkZeroOnes(s));
	}
}
