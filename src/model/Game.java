/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sergio
 */
public class Game {

    private String titulo, descripcion, grado, asignatura, unidad, duracion, dificultad;

    public Game(String titulo, String descripcion, String grado, String asignatura, String unidad, String duracion, String dificultad) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.grado = grado;
        this.asignatura = asignatura;
        this.unidad = unidad;
        this.duracion = duracion;
        this.dificultad = dificultad;
    }

    public Game(String titulo, String grado) {
        this.titulo = titulo;
        this.grado = grado;

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getGrado() {
        return grado;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String getUnidad() {
        return unidad;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void info() {
        System.out.println("Título: \n" + titulo + " \n Grado \n" + grado + "\n");
    }

}
