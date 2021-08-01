/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obpacmanobjetos;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Brenda Medina Arroyo
 */
public class HiloThread extends Thread{
    Fantasma fan;
    private int x;
    private int y;
    private int ale;
    private Color color;
    Graphics g;
    
    
    public HiloThread(Fantasma fan,Color color,int velocidad,int ale){
        this.fan=fan;
        this.g=g;
        this.ale=ale;
        this.color=color;
        
    }
    
    //Jamas meter metodos
    public void run(){
        synchronized (fan) {
            try {
                Thread.sleep(50);
                fan.posicion(ale);
                fan.dibuja(g);
                System.out.println("HILO DIBUJANDOSE JEJE fantasma 1"+ale);
            } catch (Exception e) {

            }

        }


    }
}
