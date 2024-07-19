/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajedrez;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Claudia
 */
public class Ventana extends JFrame {

    JButton[][] boton;
    int n = 8;
    JPanel panel;
    Peon p = new Peon(this);

    public Ventana() {
        panel = new JPanel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        boton = new JButton[n][n];
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new GridLayout(1, 1));
        this.add(panel);
        panel.setLayout(new GridLayout(8, 8));
        Crear();
    }
    
    public final void Crear(){
        for (int i = 0; i< 8; i++){
            for(int j = 0; j<8; j++){
                boton[i][j] = new JButton();
                boton[i][j].setName(i + "" + j);
                if(i % 2 == 0 && j % 2 == 1 || i % 2 == 1 && j % 2 == 0){
                    boton[i][j].setBackground(Color.BLACK);
                }else{
                    boton[i][j].setBackground(Color.WHITE);
                }
                panel.add(boton[i][j]);
            }
        }
        Eventos();
    }
    
    public void Eventos(){
        for(int i = 0; i< n; i++){
            for (int j = 0; j<n; j++){
                boton[i][j].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt){
                    borrar();
                    JButton evento=(JButton) evt.getSource();
                    int g=evento.getName().charAt(0)-48;
                    int h=evento.getName().charAt(1)-48;
                    p.Crear(g, h);
                    p.Mover();
                    
                }
                }
            );
        }
        }
    }
    
    public void borrar(){
        for(int i = 0; i< 8; i++){
            for(int j = 0; j<8; j++){
                if(i % 2 == 0 && j % 2 == 1 || i % 2 == 1 && j % 2 == 0){
                    boton[i][j].setBackground(Color.black);
            }else{
    boton[i][j].setBackground(Color.white);
            }
            boton[i][j].setText("");
        }
    }
    }
    
    public static void main(String[] args) {
        Ventana v = new Ventana();
        v.setVisible(true);
    }
}
