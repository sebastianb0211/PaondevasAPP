package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declarando los datos de entrada del problema

        Scanner entradateclado=new Scanner(System.in);
        String ubicacionUsuario;
        String destino;
        String nombreUsuario;
        String telefonoUsuario;

        //Inicializar las variables

        System.out.print("\u001B[36m Bienvenido a PaOndevasAPP por favor ingrese su nombre: \u001B[0m");
        nombreUsuario=entradateclado.nextLine();

        System.out.print("\u001B[36m Ahora ingrese su ubicacion: \u001B[0m");
        ubicacionUsuario=entradateclado.nextLine();

        System.out.print("\u001B[32m luego hacia donde se dirige: \u001B[0m ");
        destino=entradateclado.nextLine();

        System.out.print("\u001B[33m y por ultimo ingrese su telefono: \u001B[0m ");
        telefonoUsuario=entradateclado.nextLine();

        //Proceso del problema
         String distancia="20";// esto es un texto
        //Debo hacer parseo de la variable el tipo de dato de una variable

         Integer distanciaEntero=Integer.parseInt(distancia);
         Integer costoPorKilometro=6800;
         Integer cobroTotal=distanciaEntero*costoPorKilometro;

         //salida del problema
        System.out.println("\u001B[32m hola " +nombreUsuario+ " el costo hacia " +destino+ " vale $"+cobroTotal+ " pesos \u001B[0m");
    }
}