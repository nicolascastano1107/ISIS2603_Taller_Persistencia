package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;

@Entity
public class Director extends BaseEntity {

    private String nombre;

    private String biografia;
}

