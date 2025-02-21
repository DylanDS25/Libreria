package etitc.edu.co.sistemas.programacion;

import java.time.LocalDateTime;

public class Computador extends Recurso{
    private String marca;
    private String modelo;
    private String sistemaOperativo;

    public Computador(String nombre, LocalDateTime fechaIngreso, Boolean activo, String marca, String modelo, String sistemaOperativo) {
        super (nombre, fechaIngreso, activo);
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void coincideConCriterio (/**String criterio**/) {
        //cambiar void a Boolean
    }

    @Override
    public String toString() {
        //Logica
        return marca;
    }
}
