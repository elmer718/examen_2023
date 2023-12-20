package com.examen.entidades;



import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "entrenador")
public class Entrenador {
	
	@Id
	private int id;
	
	private String nombre;
	
	private String apellido;
	
	private Date fecha_nacimiento;
	
	private Date fecha_vinculacion;
	
	private String uuid;
	
	@ManyToOne
    @JoinColumn(name = "pueblo_id")
    private Pueblo pueblo;
	
	private String email;
	
	 @ManyToMany
	    @JoinTable(
	        name = "captura",
	        joinColumns = @JoinColumn(name = "entrenador_id"),
	        inverseJoinColumns = @JoinColumn(name = "pokemon_id")
	    )
	 private Set<Pokemon> pokemones = new HashSet<>();

}
