package Modulo2.MODULO2;
public class entregableDos {
    public static void main(String[] args) {
        double precio = 20;
        System.out.println("El precio total es : " + MasIva(precio));
    }
    public static double MasIva(double Precio){
        return Precio + 5.0;
    }
}
