import java.util.Scanner;
public class signo {
	public static void main(String args[]) {
		Scanner ler=new Scanner (System.in);
		int dia, mes;
	System.out.println("Inserir dia de anivers�rio:");	
	dia = ler.nextInt(); 
	System.out.println("Inserir m�s de anivers�rio: ");
	mes = ler.nextInt(); 
	switch (mes) {
	case 1:
		if (dia<21)
		{ 
			System.out.println("Seu signo �: Capricornio" );
		} else {
			System.out.println("Segu signo �: Aquario");
		}
		break;
	case 2:
		if (dia<19)
		{
			System.out.println("Seu signo �: Aquario");
		} else {
			System.out.println("Seu signo �: Peixe");
		}
		break;
	case 3:
		if (dia<20)
		{
			System.out.println("Seu signo �: Peixe");
		} else {
			System.out.println("Seu signo �: Aries");
		}
		break;
	case 4:
		if (dia<21) 
		{
			System.out.println("Seu signo �: Aries");
		} else {
			System.out.println("Seu signo �: Touro");
		}
		break;
	case 5:
		if (dia<21)
		{
			System.out.println("Seu signo �: Touro");
		} else {
			System.out.println("Seu signo �: Gemeos");
		}
		break;
	case 6: 
		if (dia<21)
		{
		System.out.println("Seu signo �: Gemeos");	
		} else {
			System.out.println("Seu signo �: Cancer");
		}
		break;
	case 7:
		if (dia<23) 
		{
			System.out.println("Seu signo �: Cancer");
		} else {
			System.out.println("Seu signo �: Le�o");
		}
		break;
	case 8: 
		if (dia<23)
		{
			System.out.println("Seu signo �: Le�o");
		} else {
			System.out.println("Seu signo �: Virgem");
		}
		break;
	case 9: 
		if (dia<23)
		{
			System.out.println("Seu signo �: Virgem");
		} else {
			System.out.println("Seu signo �: Libra");
		}
		break;
	case 10:
		if (dia<24)
		{
			System.out.println("Seu signo �: Libra");
		} else {
			System.out.println("Seu signo �: Escorpi�o");
		}
		break;
	case 11: 
		if (dia<22)
		{
			System.out.println("Seu signo �: Escorpi�o");
		} else {
			System.out.println("Seu signo �: Sargitario");
		}
		break;
	case 12:
		if (dia<22)
		{
			System.out.println("Seu signo �: Sargitario");
		} else {
			System.out.println("Seu signo �: Capricornio");
		}
		break;
	default: System.out.println("M�s invalido, tente novamente!");
		
	}
	}
	
}
