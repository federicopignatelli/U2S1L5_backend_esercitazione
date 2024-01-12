package federicopignatelli.U2S1L5_backend_esercitazione.DAO;

import federicopignatelli.U2S1L5_backend_esercitazione.entities.Utente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UtenteService {
    @Autowired
    private UtenteDAO utenteDAO;

    public void save(Utente utente){
        utenteDAO.save(utente);
        System.out.println("Utente salvato nel db");
    }
}
