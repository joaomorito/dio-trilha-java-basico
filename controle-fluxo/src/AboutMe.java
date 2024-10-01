import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {

        try{
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.next();
        
        System.out.println("Digite seu idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        Double altura = sc.nextDouble();

        //Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura);
        sc.close();
        } catch(InputMismatchException e){
            System.out.println("Valor inválido, preencha os campos idade e altura apenas com números.");
        }
    }
}
