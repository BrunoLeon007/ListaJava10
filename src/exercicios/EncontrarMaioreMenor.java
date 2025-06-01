package exercicios;

import java.util.Scanner;

public class EncontrarMaioreMenor {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int valor;
		do {
		    System.out.print("Digite um valor positivo (negativo para sair): ");
		    valor = sc.nextInt();
		    if (valor >= 0) {
		        if (valor > maior) maior = valor;
		        if (valor < menor) menor = valor;
		    }
		} while (valor >= 0);
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		sc.close();
	}

}
