package CalculadoraEnJava;

import java.util.Scanner;

public class Operacion {

    private final int max = 2147483647;
    private final int min = -2147483647;


    public void VerificarNum(long n) throws DesbordaCapacidadExcepcion{
        if (n > max | n < min) {
            throw new DesbordaCapacidadExcepcion("El valor introducido desborda las capacidades de esta calculadora. Inténtelo de nuevo. Inténtelo de nuevo...");
        }
    }

    public void verficarOperador(String c){
        if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/") || c.equals("%") || c.equals("s")){
        }else {
            throw new IllegalArgumentException("El operador introducido no es válido. Inténtelo de nuevo...");
        }
    }

    public long suma(long numero1, long numero2) throws DesbordaCapacidadExcepcion {
        long resultado = numero1 + numero2;
        if (resultado > max || resultado < min) {
            throw new DesbordaCapacidadExcepcion("El resultado de la suma es demasiado grande");
        }
        return resultado;
    }

    public long resta(long numero1, long numero2) throws DesbordaCapacidadExcepcion {
        long resultado = numero1 - numero2;
        if (resultado > max || resultado < min) {
            throw new DesbordaCapacidadExcepcion("El resultado de la resta es demasiado grande");
        }
        return resultado;
    }

    public long multiplicacion(long numero1, long numero2) throws DesbordaCapacidadExcepcion {
        long resultado = numero1 * numero2;
        if (resultado > max || resultado < min) {
            throw new DesbordaCapacidadExcepcion("El resultado de la multiplicacion es demasiado grande");
        }
        return resultado;
    }

    public long division(long numero1, long numero2) {
        long resultado = numero1 / numero2;
        return resultado;
    }

    public long modulo(long numero1, long numero2) {
        long resultado = numero1 % numero2;
        return resultado;
    }


}
