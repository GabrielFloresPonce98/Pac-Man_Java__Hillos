package obpacmanobjetos;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import obpacmanobjetos.Lienzo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Brenda
 */
public class Fantasma2 extends Thread implements Pinta {

    private int xF;
    private int yF;
    
      private int xF2;
    private int yF2;
    
    
    private int Sx;
    private int Sy;
    private int Sx2;
    private int Sy2;
    private Lienzo l;
    private Color col;
    private Color col2;
    private int e;
    private Graphics g;
    private int a = 0;
    private int b = 180;
    private int c = 30;
    private int d = 360;
    private Laberinto lab;

    private int ale;
    private int t;
    public int Ban;
    public int Muer;

    public Fantasma2(Lienzo l, Color col, Laberinto lab, int t, int x, int y) {
        this.l = l;
        this.col = col;
        this.e = e;
        this.g = g;
        this.lab = lab;
        this.ale = ale;
        this.t = t;
        this.xF = x;
        this.yF = y;
         this.xF2 = x;
        this.yF2 = y;
        col2=col;
        Ban=0;
        Muer=0;
    }

    public void run() {

        while (true) {
            try {
                Thread.sleep(t);

                Mover();

                if (Ban == 1) {
                   
                        
                    for (int i = 0; i < 30; i++) {
                        otro();
                        Mover();
                        Thread.sleep(200);
                        if (xF == xF2 && yF == yF2&&Muer==2) {
                            Ban = 0;
                            Muer=0;
                           break;
                        }
                       

                    }

                    Ban = 0;
                }

                col = col2;

            } catch (Exception e) {

            }

        }
       
 
    }

    public void dibuja(Graphics g) {
        int posx = 0, posy = 0;
        g.setColor(col);
        g.fillArc((posx = xF * 50), (posy = yF * 50), 50, 60, 0, 180);
        g.setColor(col);
        g.fillOval(posx, posy + 10, 20, 40);
        g.setColor(col);
        g.fillOval(posx + 15, posy + 10, 20, 40);
        g.setColor(col);
        g.fillOval(posx + 31, posy + 10, 20, 40);
        g.setColor(Color.WHITE);
        g.fillArc(posx + 10, posy + 13, 15, 15, d, d);
        g.setColor(Color.BLACK);
        g.fillArc(posx + Sx, posy + Sy, 8, 8, d, d);
        g.setColor(Color.WHITE);
        g.fillArc(posx + 27, posy + 13, 15, 15, d, d);
        g.setColor(Color.BLACK);

        g.fillArc(posx + Sx2, posy + Sy2, 8, 8, d, d);

    }

    public void Mover() {
        int pos = (int) (Math.random() * 4 + 1);
        switch (pos) {//LLAVE DEL CODIGO QUE TECLA PRESIONAS
            case 1:
                Arriba();
          
                break;
            case 2:
                Abajo();
                

                break;
            case 3:
                Derecha();
               
                break;
            case 4:
                Izquierda();
               
                break;
              

        }
           l.repaint();

    }

    public void Abajo() {
        yF++;
        if (lab.getLaberin()[yF][xF] == 1 
                || lab.getLaberin()[yF][xF] == 2 
                || lab.getLaberin()[yF][xF] == 6
                || lab.getLaberin()[yF][xF] == 3
                || lab.getLaberin()[yF][xF] == 4) {
            Sx = 15;
            Sy = 20;
            Sx2 = 28;
            Sy2 = 20;
        } else {
            yF--;
        }
//        if(lab.getLaberin()[y][x] == 1){
//            lab.getLaberin()[y][x] = 2;
//           if(lab.getLaberin() [y][x] == 2){
//                cont++;
//             
//           }
//        }

    }

    public void Derecha() {
        xF++;
        if (lab.getLaberin()[yF][xF] == 1 || lab.getLaberin()[yF][xF] == 2 || lab.getLaberin()[yF][xF] == 6 || lab.getLaberin()[yF][xF] == 3
                || lab.getLaberin()[yF][xF] == 4) {
            Sx = 20;
            Sy = 16;
            Sx2 = 34;
            Sy2 = 16;

        } else {
            xF--;
        }
//    if(lab.getLaberin() [y][x] == 1){
//        lab.getLaberin()[y][x] = 2;
//
//        if(lab.getLaberin()[y][x] == 2){
//          cont++;
//
//        }
//    }

    }

    public void Arriba() {
        yF--;
        if (lab.getLaberin()[yF][xF] == 1 || lab.getLaberin()[yF][xF] == 2 || lab.getLaberin()[yF][xF] == 6 || lab.getLaberin()[yF][xF] == 3
                || lab.getLaberin()[yF][xF] == 4) {
            Sx = 15;
            Sy = 13;
            Sx2 = 28;
            Sy2 = 13;

        } else {
            yF++;
        }

    }

    public void Izquierda() {
        xF--;
        if (lab.getLaberin()[yF][xF] == 1 || lab.getLaberin()[yF][xF] == 2 || lab.getLaberin()[yF][xF] == 6 || lab.getLaberin()[yF][xF] == 3
                || lab.getLaberin()[yF][xF] == 4) {
            Sx = 10;
            Sy = 17;
            Sx2 = 24;
            Sy2 = 17;

        } else {
            xF++;
        }

    }
    
    public  void otro() {
        col=Color.BLUE;
    }
    public void PintarOtro(int Bandera){
     Ban=Bandera;
    }
    public void MuerteFantasma(int posx,int posy, Color c,int AviMuer){
        Muer=AviMuer;
        col=c;
        xF=posx;
       yF=posy;
        
    }    
            
            public void Espera(){
        try {
            Thread.sleep(100);

        } catch (InterruptedException ex) {
            Logger.getLogger(Fantasma2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void volver(int x, int y) {
        xF = x;
        yF = y;
    }

    public int getxF() {
        return xF;
    }

    public int getyF() {
        return yF;
    }

}
