package igorEguilherme;
import java.util.Scanner;
public class Desconto {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		double produto, novap;
		System.out.println("Insira o pre�o do produto:");
		produto = ler.nextInt();
		novap = produto * 0.95; 
		System.out.println("O produto, ap�s a aplica��o do desconto, tem o valor: " + novap);
		ler.close();
	}
}
