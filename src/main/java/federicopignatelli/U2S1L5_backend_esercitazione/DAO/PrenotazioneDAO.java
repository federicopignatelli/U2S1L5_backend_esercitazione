package federicopignatelli.U2S1L5_backend_esercitazione.DAO;

import federicopignatelli.U2S1L5_backend_esercitazione.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Long>{
}
