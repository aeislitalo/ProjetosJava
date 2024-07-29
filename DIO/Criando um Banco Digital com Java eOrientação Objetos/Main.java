import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cliente usuario = new Cliente();
        usuario.setNome("Ítalo Santos");

        Conta cc = new ContaCorrente(usuario);
        Conta poupanca = new ContaPoupanca(usuario);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Banco banco = new Banco();
        banco.setContas(List.of(cc, poupanca));
        banco.listarUsuarios();
    }

}