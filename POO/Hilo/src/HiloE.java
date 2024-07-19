
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Vilchis
 */
public class HiloE extends Thread{
 
    JLabel etiqueta;
    int sec;
    public HiloE(JLabel etiqueta){
        this.etiqueta=etiqueta;

    
    }
    
    @Override
    public void run(){
        try{
            while(true){
            Thread.sleep(1);
            sec++;
            etiqueta.setText(sec+"");
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
