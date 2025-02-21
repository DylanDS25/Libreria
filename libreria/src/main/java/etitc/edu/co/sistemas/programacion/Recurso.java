package etitc.edu.co.sistemas.programacion;

import java.time.LocalDateTime;

abstract public class Recurso {
    private String nombre = "";
    private LocalDateTime fechaIngreso;
    private Boolean activo;

    //constructor
    public Recurso(String nombre, LocalDateTime fechaIngreso, Boolean activo) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getfechaIngreso() {
        return fechaIngreso;
    }

    public Boolean isActivo() {
        // logica
        return activo;
    }

    public void darDeBaja() {
        //logica
    }

    public void coincideConCriterio (/**String criterio**/) {
        //cambiar void a Boolean
    }

    @Override
    public String toString() {
        //Logica
        return nombre;
    }
}
