import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContaTerminalSClasse{
    public static void main(String[] args) throws IOException {

        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Digite seu nome: ");
        String nome = leitor.readLine();

        System.out.print("Digite sua agência: ");
        String agencia = leitor.readLine();
        
        System.out.print("Digite seu Numero da conta: ");
        int numeroDaConta = Integer.parseInt(leitor.readLine());

        System.out.print("Digite seu saldo: ");
        float saldo = Float.parseFloat(leitor.readLine().replace(",", "."));

       
        System.out.println("\nOlá, " + nome + "!");
        System.out.println("Idade: " + agencia + numeroDaConta);
        System.out.println("Saldo: R$ " + saldo);

        System.out.println("Olá, " + nome + ". Obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + " , conta " + numeroDaConta + " e seu saldo de R$" + saldo + " já está disponível para saque.");

    }
}