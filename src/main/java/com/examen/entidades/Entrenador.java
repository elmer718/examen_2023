package com.examen.entidades;



import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
	
	private Pueblo pueblo;

}
