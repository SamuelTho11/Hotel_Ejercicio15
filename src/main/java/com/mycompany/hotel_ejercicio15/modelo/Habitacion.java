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
    double precioSencila;
    double precioSuite;

    public Habitacion(int numeroHabitacion, double precioSencila, double precioSuite) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioSencila = 80000;
        this.precioSuite = 100000;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public double getPrecioSencila() {
        return precioSencila;
    }

    public void setPrecioSencila(double precioSencila) {
        this.precioSencila = precioSencila;
    }

    public double getPrecioSuite() {
        return precioSuite;
    }

    public void setPrecioSuite(double precioSuite) {
        this.precioSuite = precioSuite;
    }

    public void reservar(String cliente){
        
    }
    
    public void reservar(String cliente, int noches){
        
    }
    
    public abstract double calcularTarifa(int noches);
}
