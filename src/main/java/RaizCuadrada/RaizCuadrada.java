package RaizCuadrada;

import java.util.Scanner;

public class RaizCuadrada {
    public double raizCuadrada(int numero){
        double raiz = 0;
        if (numero < 0){
            throw new IllegalArgumentException("La raíz cuadrada no está definida para un número negativo");
        }else{
            raiz = Math.sqrt(numero);
        }
        return raiz;
    }

    public void calcularRaizCuadrada(){
        boolean salir = true;
        while (salir){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce un número: ");
            int numero = scanner.nextInt();
            double raiz = Math.round(raizCuadrada(numero) * 100.0) / 100.0;
            System.out.println("La raíz cuadrada de " + numero + " es " + raiz);

            System.out.println("Si desea salir del programa, presione N, de lo contrario presione cualquier tecla");
            String respuesta = scanner.next();
            if (respuesta.equals("N")){
                salir = false;
            }

        }

    }
}
