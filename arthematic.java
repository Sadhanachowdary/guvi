import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arthematic
{
	public static int Nth_of_AP(int a,int d,int N)
	{
		return(a+(N-1)*d);
		
	}
	public static void main (String[]args)
	{
		int a=2;
		int d=1;
		int N=5;
		System.out.println(Nth_of_AP(a,d,N));
	}
}
