public class vetoresDeNomes {
    public static void main(String[] args) {

        // Initializing the first array
        String[] letra = new String[5];
        letra[0] = "Byanca";
        letra[1] = "Kataryna";
        letra[2] = "de";
        letra[3] = "Lira";
        letra[4] = "Aleixo";

        // Loop to print elements of the first array
        for (int i = 0; i < letra.length; i++) {
            System.out.printf(" %s ",letra[i]);
        }
        System.out.println("");
        // Initializing the second array
        String[] letras = { "A", "B", "C", "D", "E" };

        // Loop to print elements of the second array
        for (int j = 0; j < letras.length; j++) {
            System.out.printf(" %s ",letras[j]);
        }
    }
}
