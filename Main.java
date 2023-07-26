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
		int ans=0;
		int total=0;
		
		for(int i=0;i<n;i++)
		{
		    int ai=sc.nextInt();
		    int bi=sc.nextInt();
		    
		    int curr=bi-ai;
		    total+=curr;
		    ans=Math.max(ans, total);
		    
		}
		System.out.println(ans);
	}
}
