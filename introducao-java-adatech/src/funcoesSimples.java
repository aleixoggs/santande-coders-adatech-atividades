import java.util.Scanner;

public class funcoesSimples {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe seu nome: ");
            String nome = scan.nextLine();
            
            nomeEntrada(nome);
        }
    }
    public static void nomeEntrada(String nome) {
        System.out.println("Hello " + nome);
    }
}
