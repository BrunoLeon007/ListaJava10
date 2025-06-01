package exercicios;

public class somaValorPar {


    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;

        do {
            if (numero % 2 == 0) {
                soma += numero;
            }
            numero++;
        } while (numero <= 500);

        System.out.println("O somatório dos valores pares de 1 a 500 é: " + soma);
    }
}
