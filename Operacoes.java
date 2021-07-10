/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraRemota;

/**
 *
 * @author yann
 */
public class Operacoes {
    
    double num1;
    float num;
    float num2;
    float num3;
    float resultado;
    
    Operacoes(String valor1, String valor2){
        num2 = Float.parseFloat(valor1);
        num3 = Float.parseFloat(valor2);
        
    }
    
    float soma(){
        num = num2+num3;
        return num;
    }   
    float subtrai(){
        num = num2-num3;
        return num;
    }
    float multiplica(){
        num = num2*num3;
        return num;
    }
    float divide(){
        num = num2/num3;
        return num;
    }
}
