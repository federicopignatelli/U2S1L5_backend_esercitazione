package federicopignatelli.U2S1L5_backend_esercitazione.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
@Getter
@Setter
@NoArgsConstructor
public class Prenotazione {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "idutente")
    private Utente utente;
    private LocalDate data;
    @ManyToOne
    @JoinColumn(name = "postazioneid")
    private Postazione postazione;

    public Prenotazione(Utente utente, LocalDate data, Postazione postazione) {
        this.utente = utente;
        this.data = data;
        this.postazione = postazione;
    }
}
