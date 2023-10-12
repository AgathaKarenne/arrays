public class exercicio3 {
    
    //Crie um programa que gere um array de números inteiros aleatórios (entre 1 e 100) com um tamanho de 10 elementos. Em seguida, encontre e exiba o maior e o menor valor no array.

    public static void main (String[] args){
        // criar um objeto da classe Random para gerar numeros aleatorios
        double randomNumber = Math.random();
        System.out.println(randomNumber);

        //criar um array de numeros inteiros aletorios e com tamanho de 10 elementos

        int elementos = 10;
        double[] numerosInteiros = new double[elementos];

         //preencher o array com numeros entrte 1 e 100
         for(int i = 0; i < elementos; i++){
            numerosInteiros[i] = Random.nextInt(100) + 1;
         }

         //chamar as variaveis  maior e menor valor no array
         double maior = numerosInteiros[0];
         double menor = numerosInteiros[0];

         //encontrar o maior e menor valor do array
         for(int i = 1; i < elementos; i++){
           if(numerosInteiros[i] > maior){
                maior = numerosInteiros[i];
           }if(numerosInteiros[i] < menor){
                menor = numerosInteiros[i];

           }
         }
         //exibir o array de numeros
         System.out.print("Numeros aleatorios:");
         for(int i = 0; i < elementos; i++){
            System.out.print(numerosInteiros[i] + "");
         }
         System.out.println();

         //exibir os valores menor e maior
         System.out.println("Maior valor:" + maior);
         System.out.println("Menor valor:" + menor);
    }
}


