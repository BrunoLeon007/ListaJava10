package exercicios;

import java.util.Scanner;

public class LeituraDeValoresNumericos {

	public static void main(String[] args) {
		
	     Scanner sc = new Scanner(System.in);
	        int totalSoma = 0;

	        for (int calculo = 1; calculo <= 15; calculo++) {
	            System.out.print("Digite o valor [" + calculo + "]: ");
	            int valor = sc.nextInt();

	            int fatorial = 1;
	            int temp = valor;
	            
	            do {
	                fatorial *= temp;
	                temp--;
	            } while (temp > 1);

	            totalSoma += fatorial;
	        }

	        System.out.println("O somatório das fatoriais dos valores digitados é: " + totalSoma);
	        sc.close();
	    }
	}
