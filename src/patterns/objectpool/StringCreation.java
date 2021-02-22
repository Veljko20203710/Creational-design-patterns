/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.objectpool;

import java.util.Date;

/**
 *
 * @author Veljko
 */
public class StringCreation {
    
    public static void main(String[] args) {
        
        Date date = new Date();
        for(int i=0;i<1000000;i++) {
          String s = new String("String");
        }
        System.out.println("Vreme potrebno za kreiranje novih String objekata:"+(new Date().getTime()-date.getTime()));
        
        date = new Date();
        for(int i=0;i<1000000;i++) {
            String s = "String";
        }
        System.out.println("Vreme potrebno koriscenjem postojecih Stringova iz pool-a:"+(new Date().getTime()-date.getTime()));
        
    }
}
