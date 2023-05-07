public class VariaveisTipos {
    public static void main(String[] args) {
        // Os tipos primitivos são 8: byte, short, int, long, float, double, boolean e
        // char (não são objetos)
        byte b = 127; // -128 a 127 1 byte
        short s = 32767; // -32.768 a 32.767 2 bytes
        int i = 2147483647; // -2.147.483.648 a 2.147.483.647 4 bytes
        long l = -9223372036854775808L; // -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 (PRECISA POR L NO
                                        // FINAL PARA O COMPILADOR ENTENDER QUE É UM LONG) 8 bytes
        float f = 15.24527F; // 4 bytes e devemos pôr F no final para o compilador considerar float
        double d = 7.6848454; // 8 bytes por padrão números de ponto flutuante são considerados double pela
                              // JVM
        boolean bool = true; // true | false
        char c = 'c'; // deve ser escrito com aspa simples, com dupla da erro de compilação
        // CONSTANTES são determinadas pela palavra reservada final
        final int ANO_ATUAL = 2023; // por boas práticas deve ser escrito em caixa alta

    }
}
