/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hotel_ejercicio15;

import com.mycompany.hotel_ejercicio15.modelo.Habitacion;
import com.mycompany.hotel_ejercicio15.modelo.Sencilla;
import com.mycompany.hotel_ejercicio15.modelo.Suite;

/**
 *
 * @author Samuel
 */
public class Hotel_Ejercicio15 {

    public static void main(String[] args) {
        Habitacion.nombreHotel();
        
        Habitacion hab1 = new Sencilla(124, 80000);
        Habitacion hab2 = new Suite(239, 120000);
        
        int noches = 3;
        
        System.out.println("Total Sencilla: " + noches + " noches: "+hab1.calcularTarifa(noches));
        System.out.println("Total Suite: "+ noches+ " noches: "+ hab2.calcularTarifa(noches));
        
        hab1.reservar("Andres");
        hab2.reservar("Luis", noches);
    }
}
