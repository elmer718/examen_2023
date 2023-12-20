package com.examen.entidades;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pokemon")
public class Pokemon {

	@Id
	private int id;
	
	private String nombre;
	
	private String descripcion;
	
	private TipoPokemon tipo_pokemon;
	
	private Date fecha_descubrimiento;
	
	private int generacion;
	
	private String uuid;
	
	@ManyToMany(mappedBy = "pokemones")
    private Set<Entrenador> entrenadores = new HashSet<>();
	
}
