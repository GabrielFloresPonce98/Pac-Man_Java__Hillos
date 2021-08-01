package obpacmanobjetos;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Pacman  implements Pinta  {
 
    AudioClip sonido;
    private int xP = 13;
    private int yP = 8;
    private int cont;
    private int Bocax=45;
    private int Bocay=315;
    static private boolean Tiem=false;
    Preguntas a=new Preguntas();
    private Laberinto Lab;
    
    public Pacman(int xP, int yP, Laberinto Lab){
        this.xP=xP;
        this.yP=yP;
        this.Lab=Lab;
     
       
    }

    
    public void dibuja(Graphics g) {
       
            Lab.limpiar(g);     
       g.setColor(Color.YELLOW);
       g.fillArc(xP * 50, yP * 50, 46 ,46, Bocax, Bocay); 
       g.setColor(Color.BLACK);
        
       g.setColor(Color.WHITE);
       g.setFont(new Font(Font.SERIF, Font.BOLD, 40));
       g.drawString(" SCORE "+cont,100,640);
       
       g.setColor(Color.WHITE);
       g.setFont(new Font(Font.SERIF, Font.BOLD, 50));
       g.drawString("* * PACMAN * *",610,640);
       
       
       
    }
   
    
            
   public void Arriba() {
        yP--;
        if (Lab.getLaberin()[yP][xP] == 1||Lab.getLaberin()[yP][xP] == 2||Lab.getLaberin()[yP][xP] == 3
                ||Lab.getLaberin()[yP][xP] == 4) {
            Bocay=310;
            Bocax=110;
            sonido= java.applet.Applet.newAudioClip(getClass().getResource("/musica/sd.wav"));
            sonido.play();
           
        } else {
            yP++;
        }
        if(Lab.getLaberin() [yP][xP] == 1){
            Lab.getLaberin()[yP][xP] = 2;
        cont++;
           
          
            
        }
         if(Lab.getLaberin() [yP][xP] == 3){
            Lab.getLaberin()[yP][xP] = 4;
             Tiem=true;
          cont+=25;
           
        }else{
             Tiem=false;
        }

    }

    public void Izquierda() {
        xP--;
        if (Lab.getLaberin()[yP][xP] == 1 || Lab.getLaberin()[yP][xP] == 2 || Lab.getLaberin()[yP][xP] == 3
                ||Lab.getLaberin()[yP][xP] == 4) {
            Bocay = 290;
            Bocax = 210;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/musica/sd.wav"));
            sonido.play();

        } else {
            xP++;
        }
        if (Lab.getLaberin()[yP][xP] == 1) {
            Lab.getLaberin()[yP][xP] = 2;
            Tiem = true;
            cont++;
        }
        if (Lab.getLaberin()[yP][xP] == 3) {
            Lab.getLaberin()[yP][xP] = 4;
            Tiem = true;
            cont += 25;
            
        }else{
             Tiem=false;
        }

    }

    public void Derecha() {
        xP++;
        if (Lab.getLaberin()[yP][xP] == 1 || Lab.getLaberin()[yP][xP] == 2 || Lab.getLaberin()[yP][xP] == 3
                ||Lab.getLaberin()[yP][xP] == 4) {
            Bocay = 300;
            Bocax = 40;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/musica/sd.wav"));
            sonido.play();

        } else {
            xP--;
        }
        if (Lab.getLaberin()[yP][xP] == 1) {
            Lab.getLaberin()[yP][xP] = 2;

            cont++;
        }
        if (Lab.getLaberin()[yP][xP] == 3) {
            Lab.getLaberin()[yP][xP] = 4;
            Tiem = true;
            cont += 25;
           
        }else{
             Tiem=false;
        }

    }

    public void Abajo() {
        yP++;
        if (Lab.getLaberin()[yP][xP] == 1 || Lab.getLaberin()[yP][xP] == 2 || Lab.getLaberin()[yP][xP] == 3
                ||Lab.getLaberin()[yP][xP] == 4) {
            Bocay = 300;
            Bocax = -60;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/musica/sd.wav"));
            sonido.play();
        } else {
            yP--;
        }
        if (Lab.getLaberin()[yP][xP] == 1) {
            Lab.getLaberin()[yP][xP] = 2;
            cont++;

        }
        if (Lab.getLaberin()[yP][xP] == 3) {
            Lab.getLaberin()[yP][xP] = 4;
            Tiem = true;

            cont += 25;
          }else{
             Tiem=false;
        }

    }

   public void Muerte(){
       yP=8;
       xP=13;
   }
     public void Volver(){
       yP=8;
       xP=13;
   }
  
  

   
    public boolean PastillaGrande(){
       if(Tiem==true);
       return Tiem;
   }
    public int Gano(){
      return cont;
    }
 

    public int getXP() {
        return xP;
    }

    public int getYP() {
        return yP;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
   

 
    

   
   
    
     
}
