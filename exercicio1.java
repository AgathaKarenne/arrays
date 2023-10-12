public class exercicio1 {

    //Crie um array de inteiros com 5 elementos e preencha-o com valores de sua escolha. Em seguida, calcule a soma de todos os elementos do array e exiba o resultado.

    public static void main(String[] args) {
        // Crie um array de inteiros com 5 elementos
        int[] numeros = {1, 2, 3, 4, 5};

        // Inicialize a variável para armazenar a soma
        int soma = 0;

        // Calcule a soma dos elementos do array
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        // Exiba o resultado da soma
        System.out.println("A soma dos elementos é: " + soma);
    }
}
