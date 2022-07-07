public class Main {
    public static void main(String[] args) {
        int resultado = 0;

        //Primera parte
        resultado = suma(55,115,223);
        System.out.println("La suma es: " + resultado);

        //Segunda parte
        Coche auto = new Coche();
        auto.agregarPuerta();
        System.out.println("El coche tiene " + auto.puertas + " Puertas");

    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }

}
class Coche {
    public int puertas = 0;

    public void agregarPuerta(){
        this.puertas = this.puertas + 2;
    }
}
