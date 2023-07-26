/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		for(int i=0;i<k;i++)
		{
		    if(n/10!=0)
		    {
		        int lastdigit=n%10;
		        if(lastdigit!=0)
		        {
		            n=n-1;
		        }
		        else
		        {
		            n=n/10;
		        }
		    }
		    else
		    {
		        n=n-1;
		    }
		}
		System.out.println(n);
	}
}
