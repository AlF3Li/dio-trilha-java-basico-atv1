
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        /* 
        int numero = Integer.valueOf(args [0]);
        String agencia = args [1];
        String nomeCliente = args [2];
        float saldo = Float.valueOf(args [3]);

        System.out.println("Olá, " + nomeCliente + ". " + "Segue abaixo as informações da sua conta: ");
        System.out.println("Número da conta: " + numero);
        System.out.println("Número da agência: " + agencia);
        System.out.println("Saldo: " + saldo);
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Número da conta: ");
        int numeroDaConta = scanner.nextInt();

        scanner.nextLine(); // <- essa linha consome a quebra de linha pendente

        System.out.println("Seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Saldo: ");
        float saldo = scanner.nextFloat();

        System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + " , conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
