package federicopignatelli.U2S1L5_backend_esercitazione.DAO;

import federicopignatelli.U2S1L5_backend_esercitazione.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioneDAO extends JpaRepository<Postazione, Long> {

//    @Query("SELECT p FROM Postazione p WHERE p.tipo = :tipo")
//    List<Postazione> filterBytipoPostazione(Enum TipoPostazione);
}
