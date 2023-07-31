/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class CapitalizeFirst
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		StringBuffer newStr=new StringBuffer(str);
		if(Character.isLowerCase(str.charAt(0)))
	    {
	        newStr.setCharAt(0, Character.toUpperCase(str.charAt(0)));
	    }
	    System.out.println(newStr);
	}
}
