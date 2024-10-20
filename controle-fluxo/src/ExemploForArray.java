public class ExemploForArray {
    public static void main(String[] args) {

        //Em arrays, o índice de elementos inicia em 0
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for(int x = 0; x<alunos.length; x++){
            System.out.println("O aluno no índice x= " + x + " é " + alunos[x]);
        }
    }
}
