package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;

@Entity
public class Actor extends BaseEntity {

    private String nombre;

    private String nacionalidad;
}
