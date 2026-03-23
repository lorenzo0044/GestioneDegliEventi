import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {

    private String nome;
    private LocalDate data;
    private TipoEvento tipo;
    private String codice;

    public Evento(String nome, LocalDate data, TipoEvento tipo) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome vuoto o nullo");
        }

        LocalDate oggi = LocalDate.now();
        if (data.isBefore(oggi)) {
            throw new DateTimeException("La data e' nel passato");
        }

        this.nome = nome;
        this.data = data;
        this.tipo = tipo;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String dataFormattata = data.format(formatter);

        int min = 100;
        int max = 999;
        int numero = (int) (Math.random() * (max - min + 1) + min);

        this.codice = "EVT-" + dataFormattata + "-" + numero;
    }


    public String getNome() {
        return nome;
    }
    public LocalDate getData() {
        return data;
    }
    public TipoEvento getTipo() {
        return tipo;
    }
    public String getCodice() {
        return codice;
    }

    public void formattaNome() {
        String [] parole = nome.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String p : parole){
           String nomeInizialeMaiuscola = p.substring(0,1).toUpperCase() + p.substring(1).toLowerCase();
           sb.append(nomeInizialeMaiuscola).append(" ");}

         this.nome = sb.toString();

        if (nome.length() > 50){
            String frase = nome.substring(0,50);
            StringBuilder s = new StringBuilder(frase);
            s.append("...");
            this.nome= s.toString();
        }
    }
     @Override

    public String toString (){
        return ("Evento : " + tipo + ", Nome dell'evento : " + nome + ", Data evento: "+ data +", Codice : "+ codice);
     }
}








