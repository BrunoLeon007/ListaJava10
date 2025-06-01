package exercicios;

public class GraoDeTrigo {

	public static void main(String[] args) {
		double graos = 1;
		double total = 0;
		int quantidade = 1;
		do {
		    total += graos;
		    graos *= 2; 
		    quantidade++;
		} while (quantidade <= 64);
		System.out.println("Total de grãos: " + total);

	}

}
