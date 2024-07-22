import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite um número para o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite um número para o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if ((parametroUm > parametroDois) || (parametroUm == parametroDois))
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        System.out.println("Iniciando a contagem do número 1 ao " + contagem);
        for(int inicio = 1; inicio <= contagem; inicio++){
            System.out.println("Imprimindo o número " + inicio);
        }
    }
}
