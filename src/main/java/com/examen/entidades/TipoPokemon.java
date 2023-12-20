package com.examen.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_pokemon")
public class TipoPokemon {

	@Id
	private int id;
	
	private String descripcion;
	
	private String uuid;
}
