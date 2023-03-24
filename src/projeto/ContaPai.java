package projeto;
//transforma em abstrata
//para impedir de instanciar, pois não faz sentido isso

public abstract class ContaPai implements Iconta{
    protected int agencia, numero;
    protected double saldo;
    private static int agenciaPadrao = 1;
    private static int SEQUENCIAL = 001;
    // referenciar metodo estatico ou variavel, coloca nome da classe e nao this
    public ContaPai(){
        this.agencia = ContaPai.agenciaPadrao;
        this.numero = SEQUENCIAL++;
        //Cada vez que a conta for instanciada vai adicionar 1

    }

    
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    //não faz diferença usar ou não o this
    public void depositar(double valor) {
        saldo += valor;
    }

    
    public void transferir(double valor, ContaPai contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    } 

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    protected void imprimirInfoComum(){
        //%d é sem numero apos a virgula
        //%.2f -- 2 casas apos a virgula
        System.out.println(String.format("Agencia %d", agencia));
        System.out.println(String.format("Número %d", numero));
        System.out.println(String.format("Saldo %.2f", saldo));
    }
}
