public class Operadores {
    public static void main(String[] args) {

        // atribuição '=' coloca o valor inial de uma variável ou altera
        String nome = "Eric";
        double soma = 10.5 + 15.7;
        int subtracao = 27 - 7;
        int multiplicacao = 9 * 9;
        int modulo = 19 % 18;
        double resultado = (10 * 7) + (20 / 4);

        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1"; // vai realizando a operação da equerda para direita até encontrar a String 31
        concatenacao = 1 + 1 + "1" + 1; // 211
        concatenacao = 1 + "1" + 1 + 1; // 1111
        concatenacao = "1" + 1 + 1 + 1;// 1111

        // Operadores Unários -, +, --, ++, !
        int numero = 10;
        numero = -numero; // - e +
        System.out.println(numero);
        numero = -numero;
        System.out.println(numero);
        System.out.println(numero++); // imprime depois incrementa
        System.out.println(++numero); // incrementa depois imprime
        boolean verdade = true;
        verdade = !verdade;
        System.out.println(verdade);

        // Operador Ternário
        numero = 10;
        String saida = numero % 2 == 0 ? "PAR" : "IMPAR";
        System.out.println(saida);

        // Operadores relacionais ==, !=, >, >=, <, <=
        String nomeUm = "";
        String nomeDois = null;
        System.out.println(nomeUm == nomeDois); // false
        System.out.println(nomeUm.equals(nomeDois)); // false
        nomeUm = "eric";
        nomeDois = "eric";
        System.out.println(nomeUm == nomeDois); // true
        System.out.println(nomeUm.equals(nomeDois)); // para comparar obetos usa-se equals

        // Operadores Lógicos &&, ||,

    }
}
