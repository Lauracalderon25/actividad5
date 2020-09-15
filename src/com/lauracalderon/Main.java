package com.lauracalderon;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int x=0, y=0, resultado1=0, resultado2=0, resultado3=0, resultado4=0, resultado5=0;
        Scanner objeto=new Scanner (System.in);
        System.out.println("Ingresar numero X:");
        x=objeto.nextInt();
        System.out.println("Ingersar numer Y:");
        y=objeto.nextInt();

        resultado1=x+y;
        resultado2=x-y;
        resultado3=x*y;
        resultado4=x/y;
        resultado5=x%y;
        System.out.println("Resultado de la suma= "+resultado1);
        System.out.println("Resultado de la resta= "+resultado2);
        System.out.println("Resultado de la multiplicación= "+resultado3);
        System.out.println("Resultado de la división= "+resultado4);
        System.out.println("Resultado de módulos= "+resultado5);
    }
}
