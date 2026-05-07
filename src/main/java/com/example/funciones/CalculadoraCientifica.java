package com.example.funciones;

public class CalculadoraCientifica {
    
    public static double suma(double x, double y) {
        return x + y;
    }

    public static double resta(double x, double y) {
        return x - y;
    }

      public static double multiplicacion(double x, double y) {
        return x * y;
    }

    public static double division(double x, double y) {
        if (y == 0) {
           System.err.println("No se puede dividir entre cero");
        }
        return x / y;
    }

    public static int calcFactorial(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
   public static final double pi = Math.PI;
    public static final double euler = Math.E;
       
}
