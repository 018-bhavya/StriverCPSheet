/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class BoyOrGirl
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		Set<Character> set= new HashSet<>();
		
		for(int i=0;i<s.length();i++)
		{
		    set.add(s.charAt(i));
		}
		int n1=set.size();
		if(n1%2==0)
		{
		    System.out.println("CHAT WITH HER!");
		}
		else
		{
		    System.out.println("IGNORE HIM!");
		}
	}
}
