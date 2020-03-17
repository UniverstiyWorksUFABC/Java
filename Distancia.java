/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;

public class Distancia
{
	public static void main(String[] args) {
	    
	    int ay, ax, bx, by;
            int Resultado1 =0;
            int Resultado2 = 0;
            int ResultadoFinal = 0;
            int exponencial1, exponencial2, ResultadoFinal2;
            double recebe;
                    
	    
	    Scanner entrada = new Scanner(System.in);
	    
		System.out.println("Entre com valor de AY");
		ay= entrada.nextInt();
		
		System.out.println("Entre com valor de AX");
		ax= entrada.nextInt();
		
		System.out.println ("Entre com valor de BY");
		by= entrada.nextInt();
		
		System.out.println("Entre com valor de BX");
		bx= entrada.nextInt();
		
		Resultado1 = ((by - ay));
		exponencial1= (Resultado1*Resultado1);
        
		Resultado2= (( bx - ax));
		exponencial2= (Resultado2*Resultado2);
        
		ResultadoFinal= (exponencial1 + exponencial2);

        recebe = Math.sqrt(ResultadoFinal);
		
		System.out.printf ("A distancia entre os pontos sao 2 %.2f", recebe);

	}
}