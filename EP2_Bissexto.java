/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    double ano;
	    
	    Scanner entrada = new Scanner(System.in);
	    
		System.out.println("Entre o ano");
		ano = entrada.nextDouble();
		
		if ((ano%400 == 0) || (ano%4 == 0 && ano%100 != 0)) 
		    {
		  
		     System.out.println("SIM");
		    
	       	}
	    
	         else 
	                 {
		                System.out.println("NAO");
		             }
	}
}
