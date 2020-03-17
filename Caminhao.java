import java.util.Scanner;

public class Caminhao {

	public static void main (String [] args)

		{
			int caminhao, Divide500, Divide100,Divide25, Divide1, resto;

		   Scanner entrada = new Scanner(System.in);
           
           System.out.println("Entre com a capacidade do caminhao");
	       caminhao=entrada.nextInt();
	       
	       Divide500 = (caminhao/500);
	       
	       Divide100 = ((caminhao%500)/100);
	       
	       Divide25 = ((caminhao%500)%100/25);
	       
	       Divide1 = (((caminhao%500)%100)%25/1);
	       
	       System.out.println("" + Divide500);
	       System.out.println("" + Divide100);
	       System.out.println("" + Divide25);
	       System.out.println("" + Divide1);
			
		}
}