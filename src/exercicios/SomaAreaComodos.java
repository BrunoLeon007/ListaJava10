package exercicios;

import java.util.Scanner;

public class SomaAreaComodos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double areaTotal = 0;
		String resposta;
		do {
		    System.out.print("Nome do cômodo: ");
		    String nome = sc.nextLine();
		    System.out.print("Largura (m): ");
		    double largura = sc.nextDouble();
		    System.out.print("Comprimento (m): ");
		    double comprimento = sc.nextDouble();
		    sc.nextLine(); 
		    double area = largura * comprimento;
		    areaTotal += area;
		    System.out.println("Área do " + nome + ": " + area + " m²");
		    System.out.print("Deseja continuar? (SIM/NÃO): ");
		    resposta = sc.nextLine().toUpperCase();
		} while (!resposta.equals("NÃO"));
		System.out.println("Área total: " + areaTotal + " m²");
		sc.close();
	}

}

