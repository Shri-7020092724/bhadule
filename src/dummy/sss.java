package dummy;

import java.util.ArrayList;
import java.util.TreeSet;

public class sss {

	public static void main(String[] args) {
		
		
	/*	String array[]={"asd","fgh","jkl","asd"};

		for(int i=0;i<=array.length-1;i++) {
		

		  for(int j=i+1;i<=array.length-1;j++) {
		
		  if(array[i].equals (array[j]));{

		
		System.out.println(array[i]);

		  }}}     */
		
		
		
	/*	String s="shrikant";
		 
		String rev="";
		  
		for(int i=s.length()-1;i>=0;i--)
		{

		  rev=rev+s.charAt(i);

		}

		System.out.println(rev);   */
		
		
		int no=12345;

		String s=Integer.toString(no);

		String rev="";


		for(int i=s.length()-1;i>=0;i--)
		{

		rev=rev+s.charAt(i);
		int n=Integer.parseInt(s);

		}
		System.out.println(rev);
		
		
		
		
		
/*		String array[]={"shravani","shrikant","shridar","shravani"};

	//	TreeSet ts=new TreeSet();

		for(int i=0;i<=array.length-1;i++)
		{
		   for(int j=i+1;j<=array.length-1;j++)
		{

		    if( array[i].equals(array[j]))
		{

		    System.out.println(array[i]);
		}
		}


		}  */
		
		
		String array[]={"shrikant","shridhar","shravani","sharvari","shridhar"};

		for(int i=0;i<=array.length-1;i++)
		{
		     for(int j=i+1;j<=array.length-1;j++)


		{
		     if(array[i].equals(array[j]))
		{

		      System.out.println(array[i]);
		}

		}



		}



















	}

}
