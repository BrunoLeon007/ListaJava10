package exercicios;

import java.util.Scanner;

public class DivisaoSemOperador {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dividendo, divisor, quociente = 0;
		System.out.print("Digite o dividendo: ");
		dividendo = sc.nextInt();
		System.out.print("Digite o divisor: ");
		divisor = sc.nextInt();
		int Dividendo = dividendo;
		while (Dividendo >= divisor) {
		    Dividendo -= divisor;
		    quociente++;
		}
		System.out.println("Resultado da divisão: " + quociente);
sc.close();
	}

}
