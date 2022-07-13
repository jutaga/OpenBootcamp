package com.OpenBootcamp;

public class Cliente extends Persona{
    private String credito;

    public Cliente(int edad, String nombre, String telefono , String credito){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.credito = credito;
    }

    public String getCredito() {
        return this.credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }
}


