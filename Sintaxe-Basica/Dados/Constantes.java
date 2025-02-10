package src;

public class Constantes {
    public static final double PI = 3.141592653589793;
    public static final int VELOCIDADE_DA_LUZ = 299792458;
    public static final String NOME_DO_PROJETO = "JavaConstantes";
    public static final int MAX_USUARIOS = 1000;
    public static final boolean SISTEMA_ATIVO = true;

    public static void main(String[] args) {
        System.out.println("Valor de PI: " + PI);
        System.out.println("Velocidade da Luz: " + VELOCIDADE_DA_LUZ + " m/s");
        System.out.println("Nome do Projeto: " + NOME_DO_PROJETO);
        System.out.println("Máximo de Usuários: " + MAX_USUARIOS);
        System.out.println("Sistema Ativo: " + SISTEMA_ATIVO);
    }
}
