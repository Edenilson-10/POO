/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrerathreads;

import javax.swing.JLabel;

/**
 *
 * @author Victor.Morales
 */
public class AnimalThread extends Thread {
    private String nombre; //nombre Animal
    private int limite; //coordenada de la meta
    private JLabel animal; //imagen animal
    private int x; // coordenada x inicial
    private int y; // coordenada y inicial
    
    public AnimalThread (){
        
    }
    public AnimalThread (String nombre, int x, int y , int limite, JLabel animal){
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.limite = limite;
        this.animal = animal;
    }
    
    public void run(){
        for (int i = x; i <= this.limite; i+=10)
        {
            System.out.println(this.nombre + "Avanza");
            this.animal.setLocation(i, y);
            try{
                sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

  

  

}
