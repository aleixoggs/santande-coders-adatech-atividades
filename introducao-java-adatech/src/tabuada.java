

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual tabuada : ");
        int tabuada = scanner.nextInt();

        System.out.print("Começar por: ");
        int comeco = scanner.nextInt();

        System.out.print("Terminar em: ");
        int fim = scanner.nextInt();

        if (fim < comeco) {
            System.out.println("O valor final não pode ser menor que o valor inicial.");
        } else {
            System.out.println("Vou montar a tabuada de 5  começando em " + comeco + " e terminando em " + fim + ":");
            for (int i = comeco; i <= fim; i++) {
                System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
            }
        }

        scanner.close();
    }
}
