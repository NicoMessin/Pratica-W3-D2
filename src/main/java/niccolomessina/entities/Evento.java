package niccolomessina.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "eventi")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "titolo", nullable = false)
    private String titolo;

    @Column(name = "data_evento", nullable = false)
    private LocalDate dataEvento;

    @Column(name = "descrizione", nullable = false)
    private String descrizione;
@Column(name = "tipoEvento")
@Enumerated(EnumType.STRING)
   private tipoEvento tipoevento;

    @Column(name = "numero_massimo_partecipanti")
    private int numeroMassimoPartecipanti;

    // Enum per tipoEvento
    public enum TipoEvento {
        PUBBLICO, PRIVATO
    }

   