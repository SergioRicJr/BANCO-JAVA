package projeto;

import java.util.List;

public class Banco {
    public String nome;

    //relação de composição
    //As contas estariam compondo o banco
    private List<Cliente> cliente;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
