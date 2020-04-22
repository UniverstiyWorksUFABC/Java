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
	    
	    Integer L1, L2, L3, soma1, soma2, soma3;
	    
	    Scanner receber = new Scanner(System.in);
	    
		System.out.println("Entre com Lado 1");
		L1= receber.nextInt();
		
		System.out.println("Entre com Lado 2");
		L2= receber.nextInt();
		
		System.out.println("Entre com Lado 3");
		L3= receber.nextInt();
		
		soma1 = (L1+L2);
		soma2 = (L2+L3);
		soma3 = (L1+L3);
		
		if (L1 > soma2){
		    System.out.println("INVALIDO");
		}
		else if (L2> soma3){
		    System.out.println("INVALIDO");
		}
		else if (L3 > soma1){
		    System.out.println("INVALIDO");
		}
		
		else{
		    System.out.println("VALIDO");
		}
		
		}
		
	}
