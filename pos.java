import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pos
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int num;
        Scanner sc=new Scanner(System.in);
         
        System.out.print("Enter any integer number: ");
        num=sc.nextInt();
        if(num>0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if(num<0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println("IT's ZERO.");
         

	}
}
