package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Pedir a, b y c
         * Leer a, b y c
         * Calcular discriminante
         * SI (discriminante>=0)
         *   SI (discriminante==0)
         *       Calcular 1 solución
         *       Escribir solución
         *   SINO
         *       Calcular 2 soluciones
         *       Escribir soluciones
         * SINO
         *   Escribir no tiene solución*/
        Scanner scan = new Scanner(System.in);
        double a = 0, b = 0, c = 0, discriminante = 0, solucion1 = 0, solucion2 = 0;
        System.out.println("Escriba a, b y c");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        discriminante = Math.pow(b, 2) - 4 * a * c;
        if (discriminante >= 0) {
            if (discriminante==0) {
                solucion1 = (-b) / 2;
                System.out.println("La solución es " + solucion1);
            }else{
                solucion1=(-b+discriminante)/2;
                solucion2=(-b-discriminante)/2;
                System.out.println("Las soluciones son "+solucion1+" "+solucion2);
            }
        }else{
            System.out.println("No existe resultado");
        }
    }
}
