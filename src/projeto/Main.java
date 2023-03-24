package projeto;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();
        cc1.depositar(5000);
        System.out.println(cc1.getSaldo());
        ContaPoupanca cc2 = new ContaPoupanca();
        cc1.transferir(3000, cc2);
        System.out.println(cc1.getSaldo());
        System.out.println(cc2.getSaldo());
        cc2.sacar(1700);
        cc1.imprimirExtrato();
        cc2.imprimirExtrato();
    }
}
