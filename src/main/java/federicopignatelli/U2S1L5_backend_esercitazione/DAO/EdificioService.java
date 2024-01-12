package federicopignatelli.U2S1L5_backend_esercitazione.DAO;
import federicopignatelli.U2S1L5_backend_esercitazione.entities.Edificio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EdificioService {
    @Autowired
    private EdificioDAO edificioDAO;

    public void save(Edificio edificio){
        edificioDAO.save(edificio);
        System.out.println("Edificio salvato nel db");
    }
}
