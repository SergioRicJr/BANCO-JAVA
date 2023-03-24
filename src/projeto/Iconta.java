package projeto;
//metodos de interface sao publicos por padrao
public interface Iconta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, ContaPai conta); //se definisse uma Iconta conta tambem funcionaria
    //Pois as demais classes estão debaixo da hierarquia de Iconta

    void imprimirExtrato();
}
