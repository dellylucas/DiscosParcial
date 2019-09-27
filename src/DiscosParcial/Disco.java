/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscosParcial;

import java.util.List;

/**
 *
 * @author ESTUDIANTES
 */
public class Disco {
    private String capacidad;
    private String nombre;
    private String precio;

    public Disco(String capacidad, String nombre, String precio) {
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }


    
}
