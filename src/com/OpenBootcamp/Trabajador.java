package com.OpenBootcamp;

public class Trabajador extends  Persona {
    private int salario;

    public Trabajador(int edad, String nombre, String telefono, int salario){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
