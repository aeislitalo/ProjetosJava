import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco() {

    }

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void listarUsuarios() {
        Set<String> nomesClientes = new HashSet<>();
        System.out.println("Lista de Usuários:");
        for (Conta conta : contas) {
            nomesClientes.add(conta.getCliente().getNome());
        }
        for (String nome : nomesClientes) {
            System.out.println(nome);
        }
    }
}
