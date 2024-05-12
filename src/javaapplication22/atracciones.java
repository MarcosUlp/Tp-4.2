/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


/**
 *
 * @author Marcos
 */
public class atracciones {
    private String nombre;
    private Queue<Visitante>visitantes;

    public atracciones(String nombre) {
        this.nombre = nombre;
        this.visitantes=new LinkedList<Visitante>();
    }

    public String getNombre() {
        return nombre;
    }
    
    
    public LinkedList RegistrodeFila(){
        return (LinkedList) visitantes;
    }
    
    public void AgregarVisitante(Visitante visita){
        visitantes.add(visita);
        System.out.println("Visitante en fila ");
    }
    
}
