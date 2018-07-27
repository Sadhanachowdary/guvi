import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class larg
{
	public static void main (String[] args) throws java.lang.Exception
	{
                      double n1 = -4.5, n2 = 3.9, n3 = 5.5;

        if(n1 >= n2) {
            if(n1 >= n3)
                System.out.println(n1 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        } else {
            if(n2 >= n3)
                System.out.println(n2 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        }

                   
	}
}
