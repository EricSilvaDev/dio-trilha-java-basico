import java.util.Scanner;
import java.util.Locale;

public class TerminalArgumentos {
    public static void main(String[] args) {
        // Para rodar um programa java fora da ide é só localizar a pasta bin e rodar o
        // comando no terminal java MinhaClasse
        // é possível atribuir valores via terminal também da seguinte forma:
        // os argumentos começam com indice 0
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]); // vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        // quando o programa for executado pelo terminal, basta passar os valores por lá
        // java TerminalArgumentos ERIC ANTONIO 34 1.76
        // os argumentos podem ser passados também pelo VsCode

        // Outra opção é a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome:");
        String n = scanner.next();
        System.out.println("Digite sua idade:");
        int i = scanner.nextInt();
        System.out.println(n + " & " + i);
    }
}
