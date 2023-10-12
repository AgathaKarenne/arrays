public class exercicio4 {

    //Crie um array de caracteres contendo uma palavra. Use um loop para percorrer o array e exibir cada caractere separadamente em uma linha.

    public static void main(String[] args){

        //criar um array de caracteres contendo uma palavra
        char[] palavra = "Word".toCharArray();

        //usar um loop para pecorrer o array e exibir cada caractere separadamente em uma linha
        for(char letra : palavra){
            System.out.println(letra);
         }
    }

}

