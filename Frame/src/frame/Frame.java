/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

/**
 *
 * @author Jirucho
 */
import java.util.*;
public class Frame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in);
        String nom;
        String sino="SI";
        int mess=0;
        int crist=0;
        int neymar=0;
        while(sino.equals("SI")){
        do{
            System.out.println("Voto?");
            nom=lea.next().toUpperCase();
            if(nom.equals("NEYMAR")){
                neymar++;
            }else if(nom.equals("RONALDO")){
                crist++;
            }else if(nom.equals("MESSI")){
                mess++;
            }
                
        }while(!"MESSI".equals(nom)&&!"RONALDO".equals(nom)&&!"NEYMAR".equals(nom));
          System.out.println("otro?"); 
          sino = lea.next().toUpperCase();
         }
        if(neymar>crist&&neymar>mess){
        System.out.print("Resultado: NEYMAR");
        }else if (crist>neymar&&crist>mess){
            System.out.print("Resultado: RONALDO");
        }else 
             System.out.print("Resultado: MESSI");
        
  
    
}}
