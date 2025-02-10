package src;

public class Classe {
    
    public static void main(String[] args) {
        
        System.out.println("Teste");
        
        String meuNome = "Anna Laura"; 
        int dataDeNascimento = 23; 
        
        System.out.println("Meu nome = " + meuNome + ", data: " + dataDeNascimento);
        
        System.out.println("1, 2");  
        
        
        int resultado = somar(5, 10);
        System.out.println("Soma: " + resultado);
    }
    
    
    public static int somar(int num1, int num2) {
        int soma = num1 + num2;
        return soma;  
    }
}
