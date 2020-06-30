/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vetores;

/**
 *
 * @author mateu
 */
public class vetoresexercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int vetor[] = new int[10];
        
        vetor[0]= 2;
        vetor[1]= 4;
        vetor[2]= 6;
        vetor[3]= 8;
        vetor[4]= 10;
        vetor[5]= 12;
        vetor[6]= 14;
        vetor[7]= 16;
        vetor[8]= 18;
        vetor[9]= 20;
        
       for (int i = 0; i < vetor.length; i++){
            System.out.println("Seu vetor é:" +vetor[i]);
    }
       vetor[4]=87;
       vetor[2]=57;
        System.out.println("-------------------------------------");
        System.out.println(vetor[4]);
        
         System.out.println("-------------------------------------");
        System.out.println(vetor[2]);
   }   
}
