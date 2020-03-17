/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
/*public class MediaNotas {
    
}
*/
import java.util.Scanner;

public class MediaNotas
{
	public static void main(String[] args) {
	    
	   double nota1, nota2, nota3, media;
           String str, notarecebe;
	   
	   Scanner entrada = new Scanner(System.in);
    	   
		System.out.println("Digite o valor da primeira nota");
                nota1= entrada.nextInt();
                		
		System.out.println("Digite o valor da segunda nota");
		nota2= entrada.nextInt();
		
		System.out.println("Digite o valor da terceira nota");
		nota3= entrada.nextInt();
                	
		System.out.printf("O valor obtido de media eh %.2f", (nota1+nota2+nota3)/3);
		
	}
}