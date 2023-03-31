package projeto;
//Duas contas sao iguais, criar pai para q possam herdar
//todo método de interface ja é publico por padrao
public class ContaCorrente extends ContaPai{
    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
        
    }

    //super.algumaCoisa -- serve para referenciar variavel ou metodo protected da classe pai
    public void imprimirExtrato() {
        System.out.println("===Extrato conta corrente===");
        imprimirInfoComum();
    }
}
