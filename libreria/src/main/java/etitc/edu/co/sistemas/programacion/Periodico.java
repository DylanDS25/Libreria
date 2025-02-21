package etitc.edu.co.sistemas.programacion;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Periodico extends Recurso{
    private LocalDate fechaPublicacion;
    private String editorial;

    public Periodico (String nombre, LocalDateTime fechaIngreso, Boolean activo, LocalDate fechaPublicacion, String editorial) {
        super (nombre, fechaIngreso, activo);
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void coincideConCriterio (/**String criterio**/) {
        //cambiar void a Boolean
    }

    @Override
    public String toString() {
        //Logica
        return editorial;
    }
}
