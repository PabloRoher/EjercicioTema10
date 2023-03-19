package CalculadoraEnJava;

import java.util.InputMismatchException;
import CalculadoraEnJava.DesbordaCapacidadExcepcion;
import java.util.Scanner;

public class Caculadora extends Operacion{

    public void calculadora() throws DesbordaCapacidadExcepcion {
        boolean bool = true;
        boolean bool2 = true;


        long numero1 = 0;
        long numero2 = 0;
        while (bool2) {
            try {
                bool = true;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Introduce el primer numero: ");
                numero1 = scanner.nextLong();
                VerificarNum(numero1);

                while (bool) {
                    try {
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.println("¿operador? (+ - * / % o s) para salir");
                        String operador = scanner1.next();
                        verficarOperador(operador);
                        try {
                            Scanner scanner2 = new Scanner(System.in);
                            System.out.println("Introduce un numero entero: ");
                            numero2 = scanner2.nextLong();
                            VerificarNum(numero2);


                            switch (operador) {

                                case "+":
                                    System.out.println("El resultado de la suma es: " + suma(numero1, numero2));
                                    numero1 = suma(numero1, numero2);
                                    break;
                                case "-":
                                    System.out.println("El resultado de la resta es: " + resta(numero1, numero2));
                                    numero1 = resta(numero1, numero2);
                                    break;
                                case "*":
                                    System.out.println("El resultado de la multiplicacion es: " + multiplicacion(numero1, numero2));
                                    numero1 = multiplicacion(numero1, numero2);
                                    break;
                                case "/":
                                    System.out.println("El resultado de la division es: " + division(numero1, numero2));
                                    numero1 = division(numero1, numero2);
                                    break;
                                case "%":
                                    System.out.println("El resultado del modulo es: " + modulo(numero1, numero2));
                                    numero1 = modulo(numero1, numero2);
                                    break;
                                case "s":
                                    bool = false;
                                    bool2 = false;
                                    break;
                            }

                        } catch (ArithmeticException e) {
                            System.out.println("La división por cero no está definida");
                        } catch (InputMismatchException e) {
                            System.out.println("El valor introducido no es un numero. Inténtelo de nuevo...");
                            bool = false;
                        }catch (DesbordaCapacidadExcepcion d) {
                            System.out.println(d.getMessage());
                            bool = false;
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("El valor introducido no es un operador. Inténtelo de nuevo...");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } catch (DesbordaCapacidadExcepcion d) {
                System.out.println(d.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("El valor introducido no es un numero. Inténtelo de nuevo...");
            }
        }
    }
}
