 package com.alvarovargas.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@SequenceGenerator(name = "SQ_DESTINO",initialValue = 1,allocationSize = 1,sequenceName = "SQ_DESTINO")
public class Destino {

	// atributos
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SQ_DESTINO")
	private Long id;
	private String ciudad;
	private String pais;
	private String fecha;
	
	//campo que llevara la relacion N:1 @ManyToOne
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Pasajero pasajero;
}
