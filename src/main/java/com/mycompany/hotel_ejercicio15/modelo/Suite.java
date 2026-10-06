/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel_ejercicio15.modelo;

/**
 *
 * @author Samuel
 */
public class Suite extends Habitacion {

    public Suite(int numeroHabitacion, double precioBase) {
        super(numeroHabitacion, precioBase);
    }

    @Override
    public double calcularTarifa(int noches) {
        return getPrecioBase() * noches;
    }
    
}
