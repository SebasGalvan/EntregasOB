package org.modulos;

public class modulo3 {

    public double getPrecio(double precio, double iva){
        iva = (precio * iva)/100;
        return precio + iva;
    }

    public static void main(String[] args) {
        System.out.println(new modulo3().getPrecio(50,10));
    }

}
