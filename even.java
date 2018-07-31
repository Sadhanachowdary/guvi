import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int limit = 4;
		System.out.println("printing even num b/w 1 and "+limit);
		for(int i=1;i<=limit;i++)
		{
			if(i%2==0){
				System.out.println(i+" ");
			}
		}
	}
}
