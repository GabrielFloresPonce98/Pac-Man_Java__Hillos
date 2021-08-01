/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obpacmanobjetos;

/**
 *
 * @author Gabriel
 */
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Brenda
 */
public class Laberinto2 {
    Color c=Color.GREEN;
     private int[][] laberin2=
    {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 3, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1,0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 0},
    {0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0 , 0, 1, 0},
    {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0},
    {0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0},
    {0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0},
    {0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 6, 6, 6, 6, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0},
    {0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0},
    {0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0},
    {0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0},
    {0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0},
    {0, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

    public int[][] getLaberin() {//RETORNO LABERINTO
        return laberin2;
    }

    public void setC(Color c) {
        this.c = c;
    }
    

    public void setLaberin(int[][] laberin) {
        this.laberin2 = laberin;
    }

    public Color getC() {
        return c;
    }
    
    
     
     //metodo setxy, getxy
     private int px;
     private int py;
     
     
     public int getx(){
         return px; 
     }
     
     public int gety(){
         return py; 
     }
     
     
             
   
//    public void dibuja(Graphics g) {
//         for (int y = 0; y < 12; y++) {
//             for (int x = 0; x < 25; x++) {
//                   px=x*50;// 
//                   py=y*50;
//               if (laberin[y][x]==0) {
//                    g.setColor(c);
//                    g.fillRect(px, py, 50, 50);
//                }
//                if(laberin[y][x]==1){
//                    int cont=0; //PARA EL
//                    g.setColor(Color.yellow);
//                    g.fillOval(px+8, py+8, 10, 10);
//                    cont++;
// 
//                }
//                if(laberin[y][x]==3){
//                    int cont=0; //PARA EL
//                    g.setColor(Color.yellow);
//                    g.fillOval(px+8, py+8, 25, 25);
//                    cont++;
// 
//                }
//                
//             }
//          System.out.println(" ");
//         }
//         
//    }
    
//    public void limpiar(Graphics g) {
//        for (int y = 0; y < 12; y++) {
//             for (int x = 0; x < 25; x++) {
//                 px = x * 50;
//                 py = y * 50;
//                 if (laberin2[y][x] == 4) {
//                     g.setColor(Color.BLACK);
//                     g.fillOval(px + 8, py + 8, 25, 25);
//
//                 }
//                 if (laberin2[y][x] == 2) {
//                    
//                      g.setColor(Color.BLACK);
//
//                     g.fillOval(px + 8, py + 8, 10, 10);
//                    
//                 }
//                 
//                   
//               
//                
//           }
//       }
//    }
}
