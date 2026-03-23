import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GestoreEventi gestore = new GestoreEventi();

        Evento evento1 = new Evento("corso di tennis", LocalDate.of(2026,12,01),TipoEvento.SPORT);
        Evento evento2 = new Evento("conferenza onu", LocalDate.of(2030,01,01),TipoEvento.CONFERENZA);
        Evento evento3 = new Evento("vasco rossi", LocalDate.of(2027,05,04),TipoEvento.CONCERTO);

        /*Evento eventoEccezioni = new Evento("", LocalDate.of(2024,05,04),TipoEvento.WORKSHOP);
        System.out.println ("Evento : " + eventoEccezioni.getTipo()+ ", Nome dell'evento : " + eventoEccezioni.getNome()+ ", Data evento: "+ eventoEccezioni.getData()+", Codice : "+ eventoEccezioni.getCodice());

         */



        System.out.println ("Evento : " + evento1.getTipo()+ ", Nome dell'evento : " + evento1.getNome()+ ", Data evento: "+ evento1.getData()+", Codice : "+ evento1.getCodice());
        System.out.println ("Evento : " + evento2.getTipo()+ ", Nome dell'evento : " + evento2.getNome()+ ", Data evento: "+ evento2.getData()  +", Codice : "+ evento2.getCodice());
        System.out.println ("Evento : " + evento3.getTipo()+ ", Nome dell'evento : " + evento3.getNome()+ ", Data evento: "+ evento3.getData()+", Codice : "+ evento3.getCodice());


        gestore.aggiungiEvento(evento1);
        gestore.aggiungiEvento(evento2);
        gestore.aggiungiEvento(evento3);

        System.out.println("Numero Eventi inseriti : " + gestore.eventiTot);


        List<Evento> eventiTrovati = gestore.cercaPerData(LocalDate.of(2026, 12, 1));

        System.out.println("Eventi trovati :"+  eventiTrovati);

        List<Evento> tipoEventiTrovati = gestore.cercaEvento(TipoEvento.CONCERTO);

        System.out.println("Eventi trovati :"+  tipoEventiTrovati);





    }
}
