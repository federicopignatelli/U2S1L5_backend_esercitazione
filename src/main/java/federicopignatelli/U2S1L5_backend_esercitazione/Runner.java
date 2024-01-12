package federicopignatelli.U2S1L5_backend_esercitazione;

import federicopignatelli.U2S1L5_backend_esercitazione.DAO.EdificioService;
import federicopignatelli.U2S1L5_backend_esercitazione.DAO.PostazioneService;
import federicopignatelli.U2S1L5_backend_esercitazione.entities.Edificio;
import federicopignatelli.U2S1L5_backend_esercitazione.entities.Postazione;
import federicopignatelli.U2S1L5_backend_esercitazione.entities.TipoPostazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    EdificioService edificioService;

    @Autowired
    PostazioneService postazioneService;

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
    }
}
