package federicopignatelli.U2S1L5_backend_esercitazione;

import federicopignatelli.U2S1L5_backend_esercitazione.DAO.EdificioService;
import federicopignatelli.U2S1L5_backend_esercitazione.DAO.PostazioneService;
import federicopignatelli.U2S1L5_backend_esercitazione.DAO.PrenotazioneService;
import federicopignatelli.U2S1L5_backend_esercitazione.DAO.UtenteService;
import federicopignatelli.U2S1L5_backend_esercitazione.entities.Edificio;
import federicopignatelli.U2S1L5_backend_esercitazione.entities.Postazione;
import federicopignatelli.U2S1L5_backend_esercitazione.entities.TipoPostazione;
import federicopignatelli.U2S1L5_backend_esercitazione.entities.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    EdificioService edificioService;

    @Autowired
    PostazioneService postazioneService;

    @Autowired
    UtenteService utenteService;

    @Autowired
    PrenotazioneService prenotazioneService;

    @Override
    public void run(String... args) throws Exception {

        Edificio edificio1 = new Edificio("Royal Palace Office", "54 W 21st St.", "New York");
        Edificio edificio2 = new Edificio("Luxury Office Building", "135 W 20th St", "Miami");
        Edificio edificio3 = new Edificio("Office Enterprise", "945 Madison Ave", "Chicago");
        edificioService.save(edificio1);
        edificioService.save(edificio2);
        edificioService.save(edificio3);

        Postazione postazione1 = new Postazione("Ottima sala conferenze", TipoPostazione.SALARIUNIONI, 12, true, edificio1);
        Postazione postazione2 = new Postazione("Ufficio con vista", TipoPostazione.OPENSPACE, 6, true, edificio1);
        Postazione postazione3 = new Postazione("Ufficio con vista", TipoPostazione.OPENSPACE, 8, true, edificio2);
        Postazione postazione4 = new Postazione("Ufficio privato confortevole", TipoPostazione.PRIVATO, 10, true, edificio3);
        postazioneService.save(postazione1);
        postazioneService.save(postazione2);
        postazioneService.save(postazione3);
        postazioneService.save(postazione4);

        Utente utente1 = new Utente("Marco","Bottari", "marcobottari99@gmail.com");
        Utente utente2 = new Utente("Luca","Botti", "lucabotti88@gmail.com");
        Utente utente3 = new Utente("Giovanni","Scleri", "giovanniscleri95@gmail.com");
        Utente utente4 = new Utente("Matteo","Rossi", "Matterorossi92@gmail.com");
        utenteService.save(utente1);
        utenteService.save(utente2);
        utenteService.save(utente3);
        utenteService.save(utente4);

    }
}
