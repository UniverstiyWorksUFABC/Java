/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;

public class Delta
{
	public static void main(String[] args) {
	    
	    int a, b, c, delta;
	    
	    Scanner entrada = new Scanner(System.in);
	    
		System.out.println("Entre com valor de A");
		a= entrada.nextInt();
		
		System.out.println ("Entre com valor de B");
		b=entrada.nextInt();
		
		System.out.println("Entre com valor de C");
		c= entrada.nextInt();
		
		delta= (b*b) - (4*a*c);
		
		System.out.println ("O valor do delta eh " + delta);
		
	}
}
