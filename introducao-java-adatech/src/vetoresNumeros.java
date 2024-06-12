import java.util.Scanner;

public class vetoresNumeros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe 5 números: ");
        int[] numero = new int[5];

        // Read numbers from the user
        for (int i = 0; i < numero.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numero[i] = scan.nextInt();
        }

        clearScreen();

        int maior = numero[0];
        int menor = numero[0];
        double media = 0;

        // Process the numbers to find the largest, smallest, and calculate the average
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] > maior) {
                maior = numero[i];
            }
            if (numero[i] < menor) {
                menor = numero[i];
            }
            media += numero[i];
        }

        System.out.println("Você digitou os seguintes números: ");
        for (int numeros : numero) {
            System.out.printf("%d ", numeros);
        }
        System.out.println("");
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media / numero.length);
        scan.close();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
