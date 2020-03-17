/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;
import java.text.DecimalFormat; 

public class Desconto
{
	public static void main(String[] args) {
	    
	    double  ValorProduto, CalculaDesconto1, CalculaDesconto2, Aux, aux2;
	    
	    Scanner entrada = new Scanner(System.in);
	     
		System.out.println ("Qual o valor do Produto");
		ValorProduto= entrada.nextInt();
                
		CalculaDesconto1 = (ValorProduto*0.10);
                System.out.println ("Valor do Desconto 10% " + CalculaDesconto1 );
        
                Aux = (ValorProduto-CalculaDesconto1);
                
		CalculaDesconto2 = (Aux*0.10);
		System.out.println ("O valor do segundo desconto " + Aux);
		
		aux2=(Aux - CalculaDesconto2);
		System.out.printf ("O valor final %.2f ", aux2);
		
	}
}
