/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obpacmanobjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Preguntas {

    private String a;
    private String b;
    private String c;
    private String d;

    String p;

    public Preguntas() {
        a = "";
        p = "";
    }

    public void pre1() {
        p = JOptionPane.showInputDialog("¿Quien descubrio America?");
        a=p;
    }  

    public void pre2() {
        p = JOptionPane.showInputDialog("¿Cual es el pais mas poblado de la tierra?");
       a=p;   
    }

    public void pre3() {
        p = JOptionPane.showInputDialog("¿Que rama de la biologia estudia a los animales?");
        a = p;
    }

    public void pre4() {
        p = JOptionPane.showInputDialog("¿A quien le crecia la nariz cuando mentia?");
        a = p;
    }

    public void pre5() {
        p = JOptionPane.showInputDialog("¿Cómo se llama el proceso por el cual las plantas obtienen alimento?");
        a = p;
    }
    
    

    public String getA() {
        return a;
    }

}
