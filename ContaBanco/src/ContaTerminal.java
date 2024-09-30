import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência! ");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite a numeração da Agência! ");
        String agencia = sc.next();

        System.out.println("Por favor, digite o Nome do Cliente! ");
        String nomeCliente = sc.next();

        System.out.println("Por favor, digite o saldo da conta: ");
        Double saldo = sc.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
