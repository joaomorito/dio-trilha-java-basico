public class main {

    public static void main(String[] args) {
        Banco bradesco = new Banco();

        Cliente joao = new Cliente("João", bradesco);
        Cliente josefino = new Cliente("Josefino", bradesco);

        Conta cc = new ContaCorrente(joao, bradesco);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(joao, bradesco);

        cc.transferir(100, poupanca);

        cc.imprimirInfosComuns();
        poupanca.imprimirInfosComuns();
    }
}
