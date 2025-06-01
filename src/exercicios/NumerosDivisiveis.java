package exercicios;

public class NumerosDivisiveis {

	public static void main(String[] args) {
	int primeiroNumero = 1;
	do {
	    if (primeiroNumero % 4 == 0) {
	        System.out.println(primeiroNumero);
	    }
	    primeiroNumero++;
	} while (primeiroNumero < 200);
}
}