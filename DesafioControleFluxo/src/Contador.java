import java.util.Scanner;

public class Contador{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        try{
            validacao(n1, n2);
        } catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    public static void validacao(int valor1, int valor2) throws ParametrosInvalidosException{
        if(valor1 > valor2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } 

        int contagem = valor2 - valor1;

        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
