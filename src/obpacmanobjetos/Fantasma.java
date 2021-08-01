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
public class Fantasma extends Thread  {
    private int x = 1;
    private int y = 1;
    private int cont;
    private int Bocax=0;
    private int Bocay=180;
    
    private int a=0;
    private int b=180;
    private int c=30;
    private int d=360;
    private int ale=0;
    
    
    private Lienzo l;
    private Color col;
    private int e;
    private  Graphics g;
    private  Laberinto lab;
   
      public Fantasma(){
        this.l=l;
        this.col=col;
        this.e=e;
        this.g=g;
        this.lab=lab;
        this.ale=ale;
    }
    
    
    public void dibuja(Graphics g) {
       g.setColor(col);
       g.fillArc(x * 50, y * 50, 48 ,48, a,b); 
       g.setColor(Color.BLACK);
       
       g.setColor(col);
       g.fillOval(x * 80, y * 68, 19 ,c); 
       g.setColor(Color.BLACK);
       
       g.setColor(col);
       g.fillOval(x * 65, y * 68, 19 ,c); 
       g.setColor(Color.BLACK);
       
       g.setColor(col);
       g.fillOval(x * 50, y * 68, 19 ,c);
       g.setColor(Color.BLACK);
       
       
       //OJITOS BLANCOS
       g.setColor(Color.WHITE);
       g.fillArc(x * 80, y * 68, 15 ,15, d, d); 
       g.setColor(Color.BLACK);
       
         g.setColor(Color.WHITE);
       g.fillArc(x * 60, y * 68, 15 ,15, d, d); 
       g.setColor(Color.BLACK);
       
       //OJITOS NEGROS
       g.setColor(Color.black);
       g.fillArc(x * 80, y * 68, 10 ,10, d, d); 
       g.setColor(Color.BLACK);
       
       g.setColor(Color.black);
       g.fillArc(x * 60, y * 68, 10 ,10, d, d); 
       g.setColor(Color.BLACK);
       

       
    }

      public void posicion(int ale){
          this.ale=ale;
          switch(ale){//LLAVE DEL CODIGO QUE TECLA PRESIONAS
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
    }
      
       public void Abajo(){
        System.out.println("ABAJO");
        y++;
        if (lab.getLaberin()[y][x] == 1 || lab.getLaberin()[y][x] == 2) {
                  
        } else {
            y--;
        }
        if(lab.getLaberin()[y][x] == 1){
            lab.getLaberin()[y][x] = 2;
           if(lab.getLaberin() [y][x] == 2){
                cont++;
             
           }
        }
        
    }
     
    
     public void Derecha() {
         System.out.println("DERECHA");
        x++;
        if (lab.getLaberin()[y][x] == 1 || lab.getLaberin()[y][x] == 2) {
       
           
        } else {
            x--;
        }
        if(lab.getLaberin() [y][x] == 1){
            lab.getLaberin()[y][x] = 2;
           
            if(lab.getLaberin()[y][x] == 2){
              cont++;
              
            }
        }
   
    }
     
     public void Arriba() {
         System.out.println("ARRIBA");
        y--;
        if (lab.getLaberin()[y][x] == 1||lab.getLaberin()[y][x] == 2) {
           
        } else {
            y++;
        }
        if(lab.getLaberin()[y][x] == 1){
            lab.getLaberin()[y][x] = 2;
        
           if(lab.getLaberin()[y][x] == 2){  
               cont++;
              
           }
            
        }
        
    }
     
      public void Izquierda() {
          System.out.println("IZQUIERDA");
        x--;
        if (lab.getLaberin()[y][x] == 1 ||lab.getLaberin()[y][x] == 2) {
           
        } else {
            x++;
        } 
        if(lab.getLaberin() [y][x] == 1){
            lab.getLaberin()[y][x] = 2;
            if(lab.getLaberin()[y][x] == 2){
              cont++;
              System.out.println("CONTADOR a"+cont);
            }  
        }
        
    }

    
    
      }
     
    

    
    

