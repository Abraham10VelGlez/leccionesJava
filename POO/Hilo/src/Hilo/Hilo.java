/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilo;

/**
 *
 * @author Acer
 */
public class Hilo extends Thread {

    String nombre;

    public Hilo(String cadena) {
        nombre = cadena;
    }
//CRONOMETRO HASTA EL MIL CON UNO, DOS Y TRES SEGUN JEJEJEJJEJE.............
    
    @Override
    public void run() {
        
        for (int i = 0; i < 1000; i++) {
            System.out.println(i+ " " + nombre);
            try {
                this.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
