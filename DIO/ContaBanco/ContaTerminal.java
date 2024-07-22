import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Digite o seu nome e sobrenome.");
       String nome = scanner.nextLine();

       System.out.println("Por favor, a sua Agência!");
       String agencia = scanner.next();

       System.out.println("Por favor, digite o número da Agência!");
       int numero = scanner.nextInt();

       System.out.println("Qual o seu saldo atual?");
       double saldo = scanner.nextDouble();

       System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
               ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
    }
}
