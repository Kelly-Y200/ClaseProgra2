package com.example.funciones;

public class CalculadoraIMC {

    public double calcularIMC(int peso, int estatura){

        //Convertir Estatura a Metros
        double estatura1 = estatura/100.0;

        //Convertir peso a kg
        double peso1 = peso * 0.453592;

        //Calcular IMC
        double imc = peso1/(estatura1*estatura1);
        
        return imc;
    }

      public int calcularIMC(double peso, double estatura){
        //Calcular IMC
        double imc = peso/(estatura*estatura);
        
        return (int) imc;
    }


    
}
