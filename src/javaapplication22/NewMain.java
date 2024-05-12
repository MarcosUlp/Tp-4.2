/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //se crea un parque y se le asignan varios juegos 
        Parque Springfield = new Parque("Springfield");
        atracciones Montaña = new atracciones("Montaña Rusa");
        Springfield.AgregarAtraccion(Montaña);
        atracciones Martillo = new atracciones("Martillo");
        Springfield.AgregarAtraccion(Martillo);
        atracciones Zamba = new atracciones("Zamba");
        Springfield.AgregarAtraccion(Zamba);
        atracciones Gusano = new atracciones("Gusano Loco");
        Springfield.AgregarAtraccion(Gusano);
        
        //se crean personas y se agregan al parque
        Visitante persona = new Visitante("Marcos", 24,0);
        Springfield.registroDeEntrada("Giraudi", 28,1);
        Springfield.registroDeEntrada("Emanuel", 3,2);
        Springfield.registroDeEntrada("Zara", 24,3);
        Springfield.registroDeEntrada("Samuel", 7,4);
        
        
        
        System.out.println("Bienvenido al parque "+ Springfield.getNombreDelParque()+ "Que accion desea realizar?");
        int opcion = 0;
        
        do {
            System.out.println("Menú:");
            System.out.println("1. Registrar entrada de clientes");
            System.out.println("2. verificar la cantidad de visitantes en el parque");
            System.out.println("3. Marcar la salida de un visitante");
            System.out.println("4. Consultar la fila de algun juego");
            System.out.println("5. Buscar niño pardido");
            System.out.println("6. Salir");
            System.out.print("Ingrese su opción: ");
            opcion= sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Registro de Entrada");
                    System.out.println("Ingrese nombre");
                    String nombre = sc.next();
                    
                    System.out.println("Ingrese edad");
                    
                    int edad = sc.nextInt();
                    
                    System.out.println("Ingrese numero de identificacion");
                    
                    int id = sc.nextInt();
                    
                    Springfield.registroDeEntrada(nombre, edad, id);//no tengo ni idea si lo agrega o no
                    
                    break;
                case 2:
                    System.out.println("Ha seleccionado la Opción 2");
                    // Lógica para la Opción 2
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (opcion != 6);
        
        
        
        
        
        
        
    }
    }
    

//Llegó el parque de diversiones
//Un parque de diversiones está implementando un nuevo sistema de control de 
//entrada para administrar la concurrencia de visitantes, con un enfoque especial en 
//las atracciones más populares. El parque tiene una capacidad máxima y quiere 
//asegurarse de que no haya más personas dentro del parque de lo que puede 
//manejar de manera segura. Además, desea optimizar la experiencia de los 
//visitantes que desean acceder a las atracciones más populares.
//El desafío es diseñar un programa en Java que modele este sistema de control de 
//entrada utilizando filas (`Queue`). El programa debe ser capaz de realizar las 
//siguientes funciones:
//3. Registro de salida de visitantes: Cuando un visitante decide salir del parque, se 
//elimina de la cola general de entrada.
//4. Filas para atracciones populares: Además de la cola general de entrada, el 
//parque implementa filas separadas para las atracciones más populares. Cuando 
//los visitantes desean acceder a una de estas atracciones, se agregan a la fila 
//correspondiente. Cada atracción tiene su propia fila de espera independiente.
//Diseña una clase en Java que implemente este sistema de control de entrada, 
//incluyendo métodos para registrar la entrada y salida de visitantes, así como para 
//verificar el estado actual de la capacidad del parque y de las filas de espera de las 
//atracciones populares.
//Suele suceder que los niños se quedan en el parque más de lo pensado y sus 
//padres llegan a preguntar por ellos, realice un método que pueda dar respuesta a 
//esto sin violar las restricciones de la fila y sin alterar la información de quienes se 
//encuentran en el parque.
//Importante: Personalice su sistema agregando alguna funcionalidad siempre 
//cuidando las restricciones del caso.
//Cualquier grupo puede ser invitado a mostrar su desarrollo