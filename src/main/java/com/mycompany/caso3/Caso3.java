package com.mycompany.caso3;


public class Caso3 {

    // Suma de dos enteros
    //int es un dato primitivoq ue almacena numeros enteros,no decimales
    public int sumar(int a, int b) {
        return a + b;
    }

    // Suma de dos decimales
    //double es un dato primitivo que almacena numero decimales
    public double sumar(double a, double b) {
        return a + b;
    }

    // Suma de tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        Caso3 op = new Caso3();

        System.out.println("Suma de dos enteros: " + op.sumar(10, 5));
        System.out.println("Suma de dos decimales: " + op.sumar(10.5, 5.3));
        System.out.println("Suma de tres enteros: " + op.sumar(10, 5, 3));
    }
}
