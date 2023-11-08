package calcular;

import java.util.Scanner;

public class calcular {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			double num1 =
				scanner.nextDouble();
		
			System.out.print("Digite o operador (+,-,*,/): ");
		char operador =
				scanner.next().charAt(0);
		
			System.out.print("Digite o segundo numero: ");
			double num2 =
		scanner.nextDouble();
			double result = 0.0;
		
		switch (operator) {
		 	case '+':
		 		result = num1 +
num2;
		 		break;
		 	case '*':
		 		result = num1 *
num2;
		 	case '/':
		 		if (num2 != 0) {
		 			result = num1 /
num2;
		 		} else {
System.out.println("Erro: Divisão por zero.");
		 	
		 			return;
		 		}
		 		break;
		 	defaut:
		 			
System.out.println("Operador invalido.");
		 		return;
		}
		
		
System.out.println("resultado:" + result);
	}
}

