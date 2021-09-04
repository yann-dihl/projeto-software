/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yanndihl.projetosoftware.tddjunit;

/**
 *
 * @author Yann Dihl
 */
public class MathUtil {
    public static int mdc(int a, int b){
        //Remover os sinais das variáveis para a propriedade 7.
        a = Math.abs(a);
        b = Math.abs(b);
        
        //Ordenar as variáveis a e b para a propriedade 6.
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
        
        //Teste da propriedade 1 e 2:
        if(b > 0 && a % b == 0){
            return b;
        }
        
        //Teste da propriedade 3:
        if(b == 0){
            return Math.abs(a);
        }
        
        //Teste da propriedade 5:
        if(a % b !=0){
            return 1;
        }
        
        return -1;
    } 
}
