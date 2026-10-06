/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel_ejercicio15.modelo;

/**
 *
 * @author Samuel
 */
public abstract class Habitacion {
    private int numeroHabitacion;
    double precioBase;

    public Habitacion(int numeroHabitacion, double precioBase) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioBase = precioBase;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
   
    public void reservar(String cliente){
        System.out.println("Habitacion reservada para: "+ cliente);
    }
    
    public void reservar(String cliente, int noches){
        System.out.println("Habitacion reservada para " + cliente + ", con esta cantidad de noches: "+ noches);
    }
    
    public static void nombreHotel() {
        System.out.println("Hotel las Americas");
    }
    
    public abstract double calcularTarifa(int noches);
}
