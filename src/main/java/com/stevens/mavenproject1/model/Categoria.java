/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stevens.mavenproject1.model;

/**
 *
 * @author LAB704-00
 */
public class Categoria {
    
        private int id_categoria;
	private String nombre;
	private String descripcion;

        public Categoria()
        {
            
        }
    public Categoria(int id_categoria, String nombre, String descripcion) {
        this.id_categoria = id_categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
	


    
}
