package federicopignatelli.U2S1L5_backend_esercitazione.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Entity
@Table(name = "utenti")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Utente {
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String cognome;
    private String mail;
    @OneToMany(mappedBy = "utente")
    private List<Prenotazione> listaprenotazioni;

    public Utente(String nome, String cognome, String mail) {
        this.nome = nome;
        this.cognome = cognome;
        this.mail = mail;
    }
}
