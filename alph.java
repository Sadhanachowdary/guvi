 java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class alph
{
public static void main (String[] args) throws java.lang.Exception
{
   char c = 'A';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
           {
           	System.out.println(c + " is an alphabet.");
             }
             else
	{
              System.out.println(c + " is not an alphabet.");
	}
	}
}
