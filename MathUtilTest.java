/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yanndihl.projetosoftware.tddjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.yanndihl.projetosoftware.tddjunit.MathUtil.mdc;

/**
 *
 * @author Yann Dihl
 */
public class MathUtilTest {
    
    public MathUtilTest() {
    }

    @Test
    //Propriedade 1: Se b>0 é um divisor de a, então mdc(a,b) = b.
    void propriedadeUm(){  
        final int a = 6;
        final int b = 3;
        final int resultadoEsperado = b;
        final int resultadoObtido = MathUtil.mdc(a, b);
        assertEquals(resultadoEsperado, resultadoObtido);
    }
    
    @Test
    //Propriedade 2: Todo número que for divisor comum de a e b também é um divisor comum de mdc(a,b).
    void propriedadeDois(){
        final int a = 16;
        final int b = 8;
        final int divisor = 4;
        final int resultadoObtido = MathUtil.mdc(a, b);
        assertTrue(resultadoObtido % divisor == 0);
    }
    
    @Test
    //Propriedade 3: Considerando que todos os números são fatores de (pois 0 = 0*a para qualquer a inteiro) então mdc(a,0)=|a|.
    void propriedadeTres(){
        final int a = 15;
        final int b = 0;
        final int resultadoEsperado = 15;
        final int resultadoObtido = MathUtil.mdc(a, b);
        assertEquals(resultadoEsperado, resultadoObtido);
    }
    
    @Test
    //Propriedade 3 porém com valor negativo:
    void propriedadeTresNegativo(){
        final int a = -30;
        final int b = 0;
        final int resultadoEsperado = 30;
        final int resultadoObtido = MathUtil.mdc(a, b);
        assertEquals(resultadoEsperado, resultadoObtido);
    }
    
    @Test
    //Propriedade 4: Se m é um inteiro não negativo então mdc(m*a,m*b) = m*mdc(a,b).
    void propriedadeQuatro(){
        final int a = 9;
        final int b = 3;
        final int m = 2;
        final int resultadoEsperado = MathUtil.mdc(a*m, b*m);
        final int resultadoObtido = m * MathUtil.mdc(a, b);
        assertEquals(resultadoEsperado, resultadoObtido);    
    }
    
    @Test
    //Propriedade 5: Se mdc(a,b) = 1 então mdc(a*b,c) = mdc(a,c)*mdc(b,c).
    void propriedadeCinco(){
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int resultadoEsperado = mdc(a*b, c);
        final int resultadoObtido = mdc(b, c);
        assertEquals(resultadoEsperado, resultadoObtido);    
    }
    
    @Test
    //Propriedade 5: Quando o resultado é 1.
    void propriedadeCincoResultadoUm(){
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int resultadoEsperado = 1;
        final int resultadoObtido = mdc(b, c);
        assertEquals(resultadoEsperado, resultadoObtido);    
    }
    
    @Test
    //Propriedade 6: mdc(a,b) = mdc(b,a).
    void propriedadeSeis(){
        final int a = 8;
        final int b = 2;
        final int resultadoEsperado = mdc(a, b);
        final int resultadoObtido = mdc(b, a);
        assertEquals(resultadoEsperado, resultadoObtido);    
    }
    
    @Test
    //Propriedade 7: mdc(-a, b) = mdc(a,-b) = mdc(-a-b) = mdc(a,b).
    void propriedadeSete(){
        final int a = -12;
        final int b = -6;
        final int resultadoEsperado = 6;
        final int resultadoObtido = mdc(a, b);
        assertEquals(resultadoEsperado, resultadoObtido);    
    }
}   
