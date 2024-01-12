package federicopignatelli.U2S1L5_backend_esercitazione.DAO;

import federicopignatelli.U2S1L5_backend_esercitazione.entities.Postazione;
import federicopignatelli.U2S1L5_backend_esercitazione.entities.Prenotazione;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PrenotazioneService {
    @Autowired
    private PrenotazioneDAO prenotazioneDAO;
    @Autowired
    private PostazioneDAO postazioneDAO;

    public void salvaPrenotazione(Prenotazione prenotazione, Postazione postazione){
        if (postazione.){

        prenotazioneDAO.save(prenotazione);
        System.out.println("Prenotazione salvata nel db");

        postazione.
        }

        else {
            throw new RuntimeException("la postazione è già occupata");
        }
    }
}
