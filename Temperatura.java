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
   
  double temperatura;
 
  Scanner entrada = new Scanner (System.in);
 
  System.out.println("Entre com a temperatura");
 
  temperatura= entrada.nextDouble();
 
  if (temperatura <= -20  ){
  System.out.printf("Muito Baixa ", temperatura);
  }
  else if ((temperatura <= -19 ) || (temperatura <= 30))
  {
  System.out.printf("Baixa ", temperatura);
  }
  else if ((temperatura <= 31) || (temperatura <= 200))
  {
  System.out.printf("Normal ", temperatura);
  }
  else if ((temperatura <= 201) || (temperatura <= 250))
  {
  System.out.printf("Alta ", temperatura);
  }
  else if (temperatura >= 251)
  {
  System.out.printf("Muito Alta ", temperatura);
}
}
}
