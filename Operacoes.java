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
    
    float resultado;
    float primeiro_valor;
    float segundo_valor;
    
    Operacoes(String valor1, String valor2){
        primeiro_valor = Float.parseFloat(valor1);
        segundo_valor = Float.parseFloat(valor2);
        
    }
    //função que realiza a operação de soma:
    float soma(){
        resultado = primeiro_valor+segundo_valor;
        return resultado;
    }   
    //função que realiza a operação de subtração:
    float subtrai(){
        resultado = primeiro_valor-segundo_valor;
        return resultado;
    }
    //função que realiza a operação de multiplicação:
    float multiplica(){
        resultado = primeiro_valor*segundo_valor;
        return resultado;
    }
    //função que realiza a operação de divisão:
    float divide(){
        resultado = primeiro_valor/segundo_valor;
        return resultado;
    }
}
