package javaapplication22;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class Parque {

    private Queue<Visitante> visitantes = new LinkedList();
    private String nombreDelParque;
    private Queue<atracciones> juegos = new LinkedList();

    public String getNombreDelParque() {
        return nombreDelParque;
    }

    
    public Parque(String nombreDelParque) {
        this.nombreDelParque = nombreDelParque;
    }

    /*1. Registro de entrada de visitantes: Cuando un visitante llega al parque, se 
    agrega a la cola general de entrada. Cada visitante tiene un identificador único.*/
    public void registroDeEntrada(String nombre, int edad, int id) {//Agregar identificador unico
        for (Visitante v : visitantes) {
            if (v.getId() == id) {
                System.out.println("el id ya esta en uso");
            } else {
                Visitante visita = new Visitante(nombre, edad, id);
                visitantes.add(visita);
                System.out.println("Visitante agregado correctamente.");

            }

        }
    }

    /*2. Control de capacidad general: El sistema debe verificar periódicamente si el 
    número total de visitantes dentro del parque ha alcanzado la capacidad máxima 
    permitida. Si es así, el sistema debe detener temporalmente la entrada de nuevos 
    visitantes hasta que haya suficiente espacio disponible dentro del parque.*/
    public int controlCapacidad() {
        return visitantes.size();
    }

    /*3. Registro de salida de visitantes: Cuando un visitante decide salir del parque, se 
    elimina de la cola general de entrada.*/
    public boolean salidaDelParque(int id) {
        Iterator<Visitante> iterator = visitantes.iterator();
        while (iterator.hasNext()) {
            Visitante visitante = iterator.next();
            if (visitante.getId() == id) {
                iterator.remove();

                System.out.println("Visitante con ID " + id + " eliminado.");
                return true;
            }
        }
        System.out.println("No se encontró ningún visitante con el ID " + id);
        return false;
    }

    /*4. Filas para atracciones populares: Además de la cola general de entrada, el 
    parque implementa filas separadas para las atracciones más populares. Cuando 
    los visitantes desean acceder a una de estas atracciones, se agregan a la fila 
    correspondiente. Cada atracción tiene su propia fila de espera independiente.*/
    public void consultarFila() {

        int contadorNinos = 0;
        for (Visitante v : visitantes) {
            if (v.getEdad() < 13) {
                contadorNinos++;
            }
        }
        System.out.println("En la fila hay " + contadorNinos + " niños.");
    }

    /*Suele suceder que los niños se quedan en el parque más de lo pensado y sus 
    padres llegan a preguntar por ellos, realice un método que pueda dar respuesta a 
    esto sin violar las restricciones de la fila y sin alterar la información de quienes se 
    encuentran en el parque.*/
    public Visitante buscarNino(int id) { //Probado por arian :)
        for (Visitante v : visitantes) {
            if (v.getEdad() < 13 && v.getId() == id) {
                System.out.println("Niño encontrado.");
                return v;
            }
        }
        System.out.println("Niño no encontrado.");
        return null;
    }
    
    public void AgregarAtraccion(atracciones atraccion){
        juegos.add(atraccion);
        System.out.println("atraccion agregada correctamente");
    }
}
