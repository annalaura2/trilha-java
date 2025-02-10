package src;

public class TiposDeVariaveis {
    public static void main(String[] args) {
        // Tipos numéricos inteiros
        byte meuByte = 127; // -128 a 127
        short meuShort = 32000; // -32.768 a 32.767
        int meuInt = 2147483647; // -2^31 a 2^31-1
        long meuLong = 9223372036854775807L; // -2^63 a 2^63-1

        // Tipos numéricos de ponto flutuante
        float meuFloat = 3.14f; // Necessário o 'f' no final
        double meuDouble = 3.141592653589793;

        // Tipo caractere
        char meuChar = 'A';

        // Tipo booleano
        boolean meuBooleano = true;

        // Impressão dos valores
        System.out.println("Byte: " + meuByte);
        System.out.println("Short: " + meuShort);
        System.out.println("Int: " + meuInt);
        System.out.println("Long: " + meuLong);
        System.out.println("Float: " + meuFloat);
        System.out.println("Double: " + meuDouble);
        System.out.println("Char: " + meuChar);
        System.out.println("Boolean: " + meuBooleano);
    }
}
