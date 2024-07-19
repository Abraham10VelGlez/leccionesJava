/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilo;

import javax.swing.JLabel;

/**
 *
 * @author Acer
 */
public class HiloE extends Thread {

    JLabel etiqueta;
   int horas , min, seg; 

    public HiloE(JLabel etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public void run() {
        try {
            while (true) {
String ht,at,st,t = "am";
                
                if (seg == 60) {
                    seg = 0;
                    min++;
                }
                if (min == 60) {
                    min = 0;
                    horas++;
                }
                
                if(horas==12 && t.equals("am")){
                   t="pm";
                   horas=0;
                }
                
                 if(horas==12 && t.equals("pm")){
                    t="am";
                    horas=0;
                }
                
                Thread.sleep(1);
                seg++;
                
                
                
                if(horas<10){ ht="0"+horas;}else{ ht=horas+"";}
                if(min<10){ at="0"+min;}else{ at=min+"";}
                if(seg<10){ st="0"+seg;}else{ st=seg+"";}
                
                etiqueta.setText(ht+":"+at+ ":"+st+""+t);
            }
        } catch (InterruptedException e) { 
            System.out.println(e.getMessage());
        }
    }
    
}
