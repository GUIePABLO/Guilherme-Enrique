package igorEguilherme;
import java.util.Scanner;

public class Reversao {
	public static void main (String args[]){
		Scanner ler= new Scanner(System.in);
		int A, B, C ;
		 System.out.println("Insir� o valor de A:");
		  A = ler.nextInt();
		  System.out.println("Insira o valor de B:");
		  B = ler.nextInt();
		  C = A;
		  A = B;
		  B = C;
		  System.out.println("O novo valor de A �: "+A +" e o novo valor de B �: "+B);
		  ler.close();
	}
}
