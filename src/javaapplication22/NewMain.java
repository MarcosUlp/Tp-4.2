/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author Marcos
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        
        
        
        
        
        
        
        
        
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
//1. Registro de entrada de visitantes: Cuando un visitante llega al parque, se 
//agrega a la cola general de entrada. Cada visitante tiene un identificador único.
//2. Control de capacidad general: El sistema debe verificar periódicamente si el 
//número total de visitantes dentro del parque ha alcanzado la capacidad máxima 
//permitida. Si es así, el sistema debe detener temporalmente la entrada de nuevos 
//visitantes hasta que haya suficiente espacio disponible dentro del parque.
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