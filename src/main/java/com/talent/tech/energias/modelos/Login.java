package com.talent.tech.energias.modelos;

public class Login {
    private String correo;
    private String contrasena;

    public Login() {
    }

    public Login(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return this.contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "{" +
            " correo='" + getCorreo() + "'" +
            ", contrasena='" + getContrasena() + "'" +
            "}";
    }
}
