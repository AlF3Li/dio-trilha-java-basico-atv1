# Terminal do banco

### Explanation:
<body> Nessa atividade aprendemos como utilizar argumentos inserido ao ao executar e também quando já estiver sendo executado.
Tive que utilizar a classe scanner (import java.util.Scanner;), que é usada para ler dados do teclado (entrada do usuário) ou de outras fontes como arquivos, strings, etc., utilizando o "system.in" (input vindo do sistema) <body>

### Curiosity:
Ao pesquisar como criar um input do usuário na aplicação, vi também uma maneira mais técnica e sem a utilização da classe Scanner:

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContaTerminal{
    public static void main(String[] args) throws IOException {
        
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Digite seu nome: ");
        String nome = leitor.readLine();

        System.out.print("Digite sua idade: ");
        int idade = Integer.parseInt(leitor.readLine());

        System.out.print("Digite seu saldo: ");
        float saldo = Float.parseFloat(leitor.readLine().replace(",", "."));

        System.out.println("\nOlá, " + nome + "!");
        System.out.println("Idade: " + idade);
        System.out.println("Saldo: R$ " + saldo);
    }
}
```
