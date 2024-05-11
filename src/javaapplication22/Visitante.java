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
public class Visitante {
    
    private String nombre;
    private int edad;
    private int id;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }
    
    public Visitante(String nombre, int edad, int id) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }
    
}
