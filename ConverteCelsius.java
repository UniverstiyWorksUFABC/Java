/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;
        
public class ConvertCelsius
{
	public static void main(String[] args) {
	    
	    double CelsiusTemperatura, FahrenheitTemperatura;
	    
	    Scanner entrada = new Scanner(System.in);
	    
		System.out.println("Entre com valor da temperatura");
		CelsiusTemperatura = entrada.nextDouble();
		
		if (CelsiusTemperatura >= -273 && CelsiusTemperatura <=4000)
		{
		
		FahrenheitTemperatura = ((9.0/5.0)*CelsiusTemperatura) + 32;
		
		System.out.printf ("O valor convertido da tempera eh %.1f", FahrenheitTemperatura);
		
		}
	    	else
	    	{
		         System.out.println("O valor fora do intervalor permitido");
		    }
	}
}

