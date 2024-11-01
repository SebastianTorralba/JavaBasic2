package ar.edu.unlar.paradigmas1.objetos;

import java.util.ArrayList;

public class Alumno extends Persona {
    private String matricula;
    private Boolean cursaActualmente;

    public boolean isCursaActualmente() {
        return cursaActualmente;
    }

    public void setCursaActualmente(boolean cursaActualmente) {
        this.cursaActualmente = cursaActualmente;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + " matricula:"+ getMatricula();
    }
    
    
    
}
