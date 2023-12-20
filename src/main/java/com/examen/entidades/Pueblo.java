package com.examen.entidades;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pueblo")
public class Pueblo {

	@Id
	private int id;
	
	private String nombre;
	
	private String uuid;
}
