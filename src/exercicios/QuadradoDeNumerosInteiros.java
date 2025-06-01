package exercicios;

public class QuadradoDeNumerosInteiros {

	
	public static void main(String[] args) {
        int numero = 15;

        do {
            System.out.println("Quadrado de " + numero + " é " + (numero * numero));
            numero++;
        } while (numero <= 200);
    }
}

