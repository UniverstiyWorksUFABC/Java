import java.util.Scanner;

public class Encripta{

	public static void main (String [] args)

		{
			int num, Posicao1, Posicao2, Posicao3, Posicao4;

			Scanner entrada = new Scanner(System.in);
            
	       num=entrada.nextInt();
	       
	       Posicao1= num%10;
	       num=num/10;
	       
	       Posicao2= num%10;
	       num=num/10;
	       
	       Posicao3= num%10;
	       num=num/10;
	       
	   	   Posicao4= num%10;
	       num=num/10;

			if (Posicao1 == 9){
				Posicao1 = 0;
			}
			else{
				Posicao1 = Posicao1 +1;
			}

			if (Posicao2 == 9)
			{
				Posicao2 = 0;
			}
			else
				Posicao2 = Posicao2 +1;

			if (Posicao3 == 9)
			{
				Posicao3 = 0;
			}
			else
				Posicao3 = Posicao3 +1;

			if (Posicao4 == 9)
			{
				Posicao4 = 0;
			}
			else
				Posicao4 = Posicao4 +1;
				
			System.out.println ("" + Posicao4 + Posicao3 + Posicao2 + Posicao1);
			
		}
}