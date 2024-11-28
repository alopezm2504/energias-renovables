package com.talent.tech.energias.modelos;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Personas")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PersonaID")
    private int id;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "Correo", nullable = false, unique = true)
    private String correo;

    @Column(name = "Contrasena", nullable = false)
    private String contrasena;

   /* @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "Roles", joinColumns = @JoinColumn(name = "PersonaID"))
    @Column(name = "Rol")
    private Set<String> roles;*/

    // Constructor vacío para JPA
    public Persona() {}

    public Persona(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
       // this.roles = roles;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

  /*  public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }*/
}
