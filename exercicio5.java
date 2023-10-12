public class exercicio5 {

    //Crie um array de números inteiros e ordene-o em ordem crescente.
    // Você pode usar um algoritmo de ordenação de sua escolha (por exemplo, o algoritmo de ordenação de bolha). Em seguida, exiba o array ordenado.

    public static void main(String[] args){

        //criar um array de numeros inteiros e de ordem crescente
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int aux = 0;
        int i = 0;

        System.out.println("Ordem Crescente");
        for(i = 0; i < 10; i++){
            System.out.println(" "+numeros[i]);
        }
    }

}

