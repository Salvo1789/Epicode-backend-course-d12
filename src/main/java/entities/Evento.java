package entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@ToString
public class Evento {

	@Id
	@GeneratedValue
	private long id;
	private String titolo;
	private LocalDate dataEvento;
	private String descrizione;
	private tipoEvento tipoEvento;
	private Integer numeroMassimoPartecipanti;

	public Evento() {
	}

	public Evento(String titolo, LocalDate date, String info, tipoEvento tipo, Integer maxNum) {
		super();
		this.titolo = titolo;
		this.dataEvento = date;
		this.descrizione = info;
		this.tipoEvento = tipo;
		this.numeroMassimoPartecipanti = maxNum;
	}
}
