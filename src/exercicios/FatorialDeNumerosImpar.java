package exercicios;

public class FatorialDeNumerosImpar {

	public static void main(String[] args) {
		
		int num = 1;
		do {
		    int fatorial = 1;
		    int temp = num;
		    do {
		        fatorial *= temp;
		        temp--;
		    } while (temp > 1);
		    System.out.println("Fatorial de " + num + " é " + fatorial);
		    num += 2;
		} while (num <= 10);

	}

}
