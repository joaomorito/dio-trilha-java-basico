public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
