package org.modulo2;

public class Main {
    public static void main(String[] args) {

        byte miByte = 127;
        short miShort = 32767;
        int miInt= 12;
        long miLong= 1000000L;

        float miFloat = 2.71f;
        double miDouble = 3.14;


        boolean miTrue = true;
        boolean miFalse = false;

        char miChar = 'g';

        String miString = "Lorem ...";

        System.out.println("Datos más comunes: Integer, Float, Double, Char, Boolean, Short, Long, Byte & Strings");

        System.out.println("Integer: "  + miInt);
        System.out.println("Short: "  + miShort);
        System.out.println("Byte: "  + miByte);
        System.out.println("Long: "  + miLong);
        System.out.println("Double: "  + miDouble);
        System.out.println("Float: "  + miFloat);
        System.out.println("Char: "  + miChar);
        System.out.println("String: "  + miString);
        System.out.println("Boolean True: "  + miTrue);
        System.out.println("Boolean False: "  + miFalse);

    }
}