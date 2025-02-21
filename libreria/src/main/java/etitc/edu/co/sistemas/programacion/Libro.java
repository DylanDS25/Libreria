package etitc.edu.co.sistemas.programacion;

import java.time.LocalDateTime;
import java.time.Year;

public class Libro extends Recurso{
    private String autor;
    private String editorial;
    private Year anio;

    public Libro (String nombre, LocalDateTime fechaIngreso, Boolean activo, String autor, String editorial, Year anio) {
        super (nombre, fechaIngreso, activo);
        this.autor = autor;
        this.editorial = editorial;
        this.anio = anio;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public Year getAnio() {
        return anio;
    }

    public void coincideConCriterio (/**String criterio**/) {
        //cambiar void a Boolean
    }

    @Override
    public String toString() {
        //Logica
        return autor;
    }
}
