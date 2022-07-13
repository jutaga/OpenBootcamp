package com.OpenBootcamp;

public class Main {
    public static void main(String[] args) {

        Cliente persona = new Cliente(25, "juan","305894188" , "Disponible");
        System.out.println(persona.nombre + " tiene " + persona.edad + " de edad" + " y su telefono es: " + persona.telefono + " estado de credito: " + persona.getCredito());

        Trabajador trabajador = new Trabajador(30,"pablo","36954171", 3698);
        System.out.println(trabajador.nombre + " tiene: " + trabajador.edad + " de edad y tiene un salario de: " + trabajador.getSalario() + " Euros\nTelefono: " + trabajador.telefono);
    }
}
