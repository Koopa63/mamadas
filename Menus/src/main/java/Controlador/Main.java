/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vistas.*;
/**
 *
 * @author Koopa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Algoritmos.Vector obj = new Algoritmos.Vector();
        
        int[] vector = obj.llamaVector();
        System.out.println(vector);
        
        VistaPrincipal v = new VistaPrincipal();
        v.setVisible(true);
    }
    
}
