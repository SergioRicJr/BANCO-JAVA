package projeto;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    public String nome;

    //relação de composição
    //As contas estariam compondo o banco
    public List<Cliente> clientes;

    public Banco(String nome){
        this.clientes = new ArrayList<>();
        this.nome = nome;
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void listarClientes(){
        System.out.println(this.clientes);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
