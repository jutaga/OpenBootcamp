package com.OpenBootcamp;

public class Main {
    public static void main(String[] args) {

        persona persona1 = new persona();

        persona1.setEdad(25);
        persona1.setNombre("Juan pablo");
        persona1.setTelefono(23695);

        System.out.println(persona1.getNombre() + " tiene una edad de " + persona1.getEdad() + " y su telefono es: " + persona1.getTelefono());

    }
}

class persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
