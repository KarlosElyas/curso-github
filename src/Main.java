import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		int mask = 0b100000;
		int valor = input.nextInt();
		
		if ((valor&mask)!=0) {
			System.out.println("A sexta posição é 1!");
			
		}else {
			System.out.println("A sexta posição não é 1!");
		}

		input.close();
	}

}

/*char x;
		do {
			
			System.out.println("Digite a temperatura em Celsius:");
			Double c = input.nextDouble();
			System.out.printf("Equivalente em Fahrenheit: %.1f\n",(9*c/5+32));
			
			System.out.println("Deseja repetir (s/n)?");
			x = input.next().charAt(0);
			
		} while (x != 'n'); */