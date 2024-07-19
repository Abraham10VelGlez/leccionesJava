/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajedrez;

import java.awt.Color;

/**
 *
 * @author Claudia
 */
public class Peon implements Pieza {
    
    Ventana ventana;
    int x;
    int y;
    
    public Peon (Ventana v) {
        this.ventana = v;
    }
    
    @Override
    public void Crear(int x, int y) {
        this.ventana.boton[x][y].setText("P");
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void Mover() {
        if (x > 0) {
            this.ventana.boton[x - 1][y].setBackground(Color.red);
        }
    }
}
