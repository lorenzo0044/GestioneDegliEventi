import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestoreEventi{

    Evento [] arrayEventi = new Evento [100];

    int eventiTot = 0;

    public void aggiungiEvento(Evento e){
        if (eventiTot < 100){
            arrayEventi[eventiTot] = e;
            eventiTot++;
        }
    }
    public List<Evento> cercaPerData (LocalDate data){

         List<Evento> eventiTrovati = new ArrayList<>();

        for (int i = 0; i< eventiTot; i++){

            if (arrayEventi[i].getData().equals(data)) {
                eventiTrovati.add(arrayEventi[i]);
            }
        }
        return eventiTrovati;
    }

    public List<Evento> cercaEvento (TipoEvento tipo){

        List<Evento> tipoEventiTrovati = new ArrayList<>();

        for (int i = 0; i < eventiTot;i++){

            if (arrayEventi[i].getTipo().equals(tipo)) {
                tipoEventiTrovati.add(arrayEventi[i]);

            }
        }
        return tipoEventiTrovati;

    }

}
