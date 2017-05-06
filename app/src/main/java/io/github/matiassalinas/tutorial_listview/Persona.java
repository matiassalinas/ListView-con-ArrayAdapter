package io.github.matiassalinas.tutorial_listview;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombreCompleto(){
        return this.nombre + " " + this.apellido;
    }

    public int getEdad() {
        return edad;
    }

}
