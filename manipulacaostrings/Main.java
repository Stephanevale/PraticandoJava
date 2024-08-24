package manipulacaostrings;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.time.format.TextStyle;


public class Main {
    public static void main(String[] args) {
        
        String nome = "Stephane";
        //System.out.println(nome.toUpperCase());
        //System.out.println(nome.toLowerCase());
        //System.out.println(nome.length());

        //String nomeOutro = "stephane";
        //System.out.println(nome.equalsIgnoreCase(nomeOutro));

        LocalDate hoje = LocalDate.now();

        Locale brasil = new Locale("pt","BR");
        // System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom dia";

        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";

        } else if (agora.getHour() >=18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        } else{
            saudacao = "Olá";
        }


        System.out.printf("Olá, %s. Hoje é %s, %s. %n", nome, diaDaSemana, saudacao.toUpperCase());

    }
}
