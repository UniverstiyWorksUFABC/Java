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
   
  double peso, altura, imc;
 
  Scanner entrada = new Scanner (System.in);
 
  System.out.println("Entre com seu peso");
  peso = entrada.nextDouble();
 
  System.out.println("Entre com a sua altura");
  altura = entrada.nextDouble();
 
  altura = (altura/100);
 
  imc = (peso/(altura*altura));
 
  if (imc <= 18.5){
      System.out.printf("Magro ", imc);
  }
  else if (imc <=25){
      System.out.printf("Acima do Peso ", imc);
  }
  else if (imc <=30){
      System.out.printf("Obeso ", imc);
  }
  else if (imc >=35){
   System.out.printf("Morbidez ", imc);
}
}
}
