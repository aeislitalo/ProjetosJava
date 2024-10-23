import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cliente usuario1 = new Cliente();
        usuario1.setNome("Ítalo Santos");

        Cliente usuario2 = new Cliente("Maria Silva");

        Conta cc1 = new ContaCorrente(usuario1);
        Conta cc2 = new ContaCorrente();

        Conta poupanca1 = new ContaPoupanca(usuario1); 
        Conta poupanca2 = new ContaPoupanca();

        cc1.depositar(100);
        cc1.transferir(100, poupanca1);

        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();

        Banco banco1 = new Banco();
        banco1.setContas(List.of(cc1, poupanca1));

        Banco banco2 = new Banco("Banco Nacional", List.of(cc1, poupanca1));
        banco1.listarUsuarios();
    }


}