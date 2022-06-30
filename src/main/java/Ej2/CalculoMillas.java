package Ej2;

import java.util.Scanner;

public class CalculoMillas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor en millas:");
        int numero = sc.nextInt();
        System.out.println("El valor ingresado en Millas corresponde a: " + numero * 1.60934 + "Kms");
        while (numero>0){

            numero = sc.nextInt();
            System.out.println("El valor ingresado en Millas corresponde a: " + numero * 1.60934 + "Kms");
        }
        System.out.println("Ha salido del sistema");

    }

}
