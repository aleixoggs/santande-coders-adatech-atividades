import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class dataTime {
    public static void main(String[] args) {
        
        // Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA!
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe seu nome: ");
            String nome = scan.nextLine();

            // ISO 8601 
            LocalDate hoje = LocalDate.now();
            Locale brasil = new Locale("pt", "BR");

            String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
            String saudacao;
            LocalDateTime agora = LocalDateTime.now();
            
            if (agora.getHour() >= 0 && agora.getHour() < 12) {
                saudacao = "Bom Dia!";
            } else if (agora.getHour() >= 12 && agora.getHour() < 18){
                saudacao = "Boa Tarde!";
            } else {
                saudacao = "Boa Noite!";
            }

            System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
        }
    }
}
