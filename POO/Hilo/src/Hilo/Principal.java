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
public class Principal {
    public static void main(String[] args) {
        Hilo uno=new Hilo("Uno");
        Hilo dos=new Hilo("Dos");
        Hilo tres=new Hilo("Tres");
        uno.start();
        dos.start();
        tres.start();
    }
}
