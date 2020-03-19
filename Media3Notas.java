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
   
  double nota1, nota2, notaRec, media, mediaRec;
 
  Scanner entrada = new Scanner (System.in);
 
  System.out.printf("Entre com a nota da P1");
  nota1 = entrada.nextDouble();
 
  System.out.println("Entre com a nota da P2");
  nota2 = entrada.nextDouble();
 
  media = ((nota1+nota2)/2);
 
  if (media >=5){
      System.out.printf("Aprovado %.2f", media);
  }
 
  else{
      System.out.println("Entre com a nota da Rec");
      notaRec= entrada.nextDouble();
 
  mediaRec = ((media+notaRec)/2);
 
  if (mediaRec >=5){
      System.out.printf("Aprovado %.2f", mediaRec);
  }
  else{
      System.out.println("Reprovado");
  }
  }
 

}
}