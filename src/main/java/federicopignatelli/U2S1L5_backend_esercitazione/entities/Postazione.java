package federicopignatelli.U2S1L5_backend_esercitazione.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "postazioni")
@Getter
@Setter
@NoArgsConstructor
public class Postazione {
    @Id
    @GeneratedValue
    private long id;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    @Column(name = "Tipo_di_postazione")
    private TipoPostazione tipoPostazione;
    private long maxutenti;
    private boolean postazioneaccessibile;
    @ManyToOne
    @JoinColumn(name = "idedificio")
    private Edificio edificio;
    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> listaprenotazioni;

    public Postazione(String descrizione, TipoPostazione tipoPostazione, long maxutenti, boolean postazioneaccessibile, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.maxutenti = maxutenti;
        this.postazioneaccessibile = postazioneaccessibile;
        this.edificio = edificio;
    }
}
