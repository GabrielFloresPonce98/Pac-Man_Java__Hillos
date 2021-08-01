package obpacmanobjetos;
import javax.swing.JFrame;

/**
 *
 * @author Brenda
 */
public class Ventana extends JFrame {//extiende a JFRAME
    
    public Ventana(){
     
        
        this.setTitle("PACMAN");///TITULO
        this.setSize(1350, 700);//TAMAÑO
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lienzo a=new Lienzo();//
        this.add(a);
        this.addKeyListener(a);//ESCUCHA LO QUE QUIERE HACER EL KEY PARA BOTONES
        
        
    }  
    
}
