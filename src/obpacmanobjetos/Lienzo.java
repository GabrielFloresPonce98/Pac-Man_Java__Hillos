/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obpacmanobjetos;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;
import javax.swing.JPanel;

/**
 * HERENCIA Y IMPLEMENTACION
 *
 * @author Brenda
 */
public class Lienzo extends JPanel implements KeyListener {

    private int xP = 13;
    private int yP = 8;
    private int xF = 13;
    private int yF = 8;
    private AudioClip sonido;
    private Pacman Pa; 
    private HiloThread fan1;
    private Fantasma2 f1, f2, f3, f4;
    private Color c1 = Color.RED, c2 = Color.CYAN, c3 = Color.PINK, c4 = Color.ORANGE;
    Fantasma c = new Fantasma();
    private Laberinto Lab;
    private Laberinto2 Lab2;
 

    public Lienzo() {
     
        
        this.setBackground(Color.BLACK);
        
        Lab = new Laberinto();
    
        f1 = new Fantasma2(this, c1, Lab, 100, 11, 6);
        f2 = new Fantasma2(this, c2, Lab, 400, 12, 6);
        f3 = new Fantasma2(this, c3, Lab, 200, 13, 6);
        f4 = new Fantasma2(this, c4, Lab, 350, 14, 6);
        Pa = new Pacman(xP, yP,Lab);

        f1.start();
        f2.start();
        f3.start();
        f4.start();
        
                
       

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
      
    
        Lab.dibuja(g);
        Pa.dibuja(g); //SE DIBUJA PACMAN
        Muerte();
            Tome();
        f1.dibuja(g);
        f2.dibuja(g);
        f3.dibuja(g);
        f4.dibuja(g);
        MuerteFantasma();

        Lab.cambio(Pa.Gano());
        if (Pa.Gano() == 30) {
            Pa.setCont(0);
            Pa.Volver();
            f1.volver(11, 6);
            f2.volver(12, 6);
            f3.volver(13, 6);
            f4.volver(14, 6);

        }


    }

    public void keyTyped(KeyEvent ke) {
    }

    public void keyPressed(KeyEvent ke) {

        switch (ke.getKeyCode()) {//LLAVE DEL CODIGO QUE TECLA PRESIONAS
            case KeyEvent.VK_UP:
                Pa.Arriba();
               
                break;
            case KeyEvent.VK_LEFT:
                Pa.Izquierda();
               
                break;
            case KeyEvent.VK_RIGHT:
                Pa.Derecha();
              
                break;
            case KeyEvent.VK_DOWN:
                Pa.Abajo();
               
                break;

        }
          repaint();
        
    }

    public void keyReleased(KeyEvent ke) {
    }

    private void Muerte() {

        if (f1.Ban == 0 && f1.getxF() == Pa.getXP() && f1.getyF() == Pa.getYP()
                || f2.Ban == 0 && f2.getxF() == Pa.getXP() && f2.getyF() == Pa.getYP()
                || f3.Ban == 0 && f3.getxF() == Pa.getXP() && f3.getyF() == Pa.getYP()
                || f4.Ban == 0 && f4.getxF() == Pa.getXP() && f4.getyF() == Pa.getYP()) {
            Pa.Muerte();
        }
    }

    private void Tome() {

        if (Pa.PastillaGrande() == true) {

            f1.PintarOtro(1);
            f2.PintarOtro(1);
            f3.PintarOtro(1);
            f4.PintarOtro(1);

        }
    }

    private void MuerteFantasma() {

        if (f1.Ban == 1 && f1.Ban == 1 && f1.getxF() == Pa.getXP() && f1.getyF() == Pa.getYP()) {
            f1.MuerteFantasma(11, 6,c1,2);

        }
        if (f2.Ban == 1 && f2.Ban == 1 && f2.getxF() == Pa.getXP() && f2.getyF() == Pa.getYP()) {
            f2.MuerteFantasma(12, 6,c2,2);

        }
        if (f3.Ban == 1 && f3.Ban == 1 && f3.getxF() == Pa.getXP() && f3.getyF() == Pa.getYP()) {
            f3.MuerteFantasma(13, 6,c3,2);

        }
        if (f4.Ban == 1 && f4.Ban == 1 && f4.getxF() == Pa.getXP() && f4.getyF() == Pa.getYP()) {
            f4.MuerteFantasma(14, 6,c4,2);

        }

    }


  
    
    

     
    
}
