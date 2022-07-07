package com.OpenBootcamp;

public class punto5 {
    public static void main(String[] args) {
        String estacion = "invierno";

        switch (estacion){
            case "primavera":
            case "verano":
            case "otoño":
            case "invierno":
                System.out.println("Estacion: " + estacion);
                break;
            default:
                System.out.println("No es una estacion valida");
        }
    }
}
