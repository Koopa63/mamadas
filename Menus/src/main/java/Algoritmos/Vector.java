/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Vector {
    
    public static List<Integer> datos = new ArrayList<Integer>();
    
    public static void ingresar(int numero){
        datos.add(numero);
    }
    


    public List<Integer> randomListFill(){
        int size=10;
        int randomNum=1;
        List<Integer> list= new ArrayList<>();
        for (int i=0;i<size;i++){
            randomNum = ThreadLocalRandom.current().nextInt(0, 1000 + 1);
            list.add(randomNum);
        }
        return list;
    }
        


    
}
