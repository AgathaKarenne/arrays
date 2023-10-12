public class exercicio6 {
    
    //Crie uma matriz bidimensional para representar uma tabela de notas de alunos, onde as linhas representam os alunos e as colunas representam as notas em diferentes disciplinas.
    // Preencha a matriz com algumas notas fictícias e, em seguida, calcule e exiba a média de notas de cada aluno.

    public static void main(String[] args){

                int numeroAlunos = 10;
                int numeroMaterias = 5;
        
                // Crie a matriz de notas
                double[][] notas = {
                    {3,0, 4.0, 6.6, 4.5, 5.5},
                    {6.0, 7.5, 8.0, 9.0, 10},
                    {5.0, 7.0, 8.5, 7.5, 9.0},
                    {7.5, 8.0, 7.0, 9.5, 8.0},
                    {8.0, 7.5, 7.5, 4.0, 6.0},
                    {2.0, 3.5, 4.5, 5.5, 7.0},
                    {1.0, 2.5, 3.5, 4.5, 6.0},
                    {4.0, 5.5, 3.5, 6.0, 4.0},
                    {5.0, 6.5, 7.5, 5.5, 7.0},
                    {2.0, 4.5, 5.5, 6.5, 8.0},
                };
        
                // Calcule e exiba a média de notas de cada aluno
                for (int aluno = 0; aluno < numeroAlunos; aluno++) {
                    double somaNotas = 0;
                    for (int materias = 0; materias < numeroMaterias; materias++) {
                        somaNotas += notas[aluno][materias];
                    }
                    double media = somaNotas / numeroMaterias;
                    System.out.println("Média do Aluno " + (aluno + 1) + ": " + media);
                }
    }       
        
}       
