package projeto;

public class ContaPoupanca extends ContaPai{
    
    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    public void imprimirExtrato() {
        System.out.println("===Extrato conta poupança===");
        imprimirInfoComum();
    }
}
