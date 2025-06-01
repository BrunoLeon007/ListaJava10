package exercicios;

import java.util.Scanner;

public class LeituraSucessiva {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valor, soma = 0, quantidade = 0;
		double media;
		do {
		    System.out.print("Digite um valor positivo ou negativo para sair: ");
		    valor = sc.nextInt();
		    if (valor >= 0) {
		        soma += valor;
		        quantidade++;
		    }
		} while (valor >= 0);
		if (quantidade > 0) {
		    media = (double) soma / quantidade;
		    System.out.println("Total: " + soma);
		    System.out.println("Média: " + media);
		} else {
		    System.out.println("Nenhum valor positivo foi inserido.");
		}
sc.close();
	}

}
