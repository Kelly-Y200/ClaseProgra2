package com.example;
/* 
import com.example.funciones.CalculadoraCientifica;
import com.example.funciones.CalculadoraIMC;
import com.example.funciones.ClaseEstatica;
import com.example.funciones.implementacion;
import com.example.objetos.Alumno;
import com.example.objetos.Persona;
import com.example.objetos.Book;
*/
import com.example.objetos.Person;
public class Main {
    
    public static void main(String[] args) {

       
      /* implementacion classImplementacion  = new implementacion();
       classImplementacion.stop = 10;
       classImplementacion.factorial();

        System.out.println("El factorial es "+classImplementacion.factorial);*/

        /* 
        Persona juan = new Persona();
        juan.setNombre("Juan");
        juan.apellido = "Perez";
        juan.edad = 30;
        juan.dinero = 40;
        //juan.hablar();

        juan.dinero = 30;
        juan.setNombre("Carlos");
        //juan.hablar();




        Persona pedro = new Persona();
        pedro.setNombre("Pedro");
        pedro.apellido = "Gomez";
        pedro.edad = 25;
        pedro.dinero = 30;
        //pedro.hablar();


        pedro = juan;
        pedro.hablar();

        Persona mario = pedro;
        mario.hablar();
        mario.setNombre("Mario");
        pedro.hablar();

        */


        /* 


        Alumno alumno1 = new Alumno();
        System.out.println(alumno1.getNombre());

        Alumno alumno2 = new Alumno(1701456342,"Ana", 20, 160,50);
        System.out.println(alumno2.getNombre());

        CalculadoraIMC imc = new CalculadoraIMC();
        double resultado = imc.calcularIMC(alumno2.getPeso(), alumno2.getEstatura());
        double resultado2 = imc.calcularIMC(alumno2.pesoEnKg(), alumno2.estaturaEnMetros());

        System.out.println(resultado);
        System.out.println(resultado2);
        */


        /* 
        Book libro1 = new Book();
       // libro1.toString();

        CalculadoraCientifica c = new CalculadoraCientifica();
        c.calcFactorial(4);
*/

    int number = 10;
    Person person = new Person("Alice");

    System.out.println("Before "+person.name);
    modifyPerson(person);
    System.out.println("After "+person.name);

    }

    public static void modifyPerson(Person p){
        Person newPerson = p;
        newPerson.name = "Bob";
    }


}