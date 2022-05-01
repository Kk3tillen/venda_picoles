/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendapicole;
import java.util.ArrayList;
/**
 *
 * @author kezia
 */

public class Sorvete extends Produto{
    
    private String tamanho;
    
    public Sorvete() {
        
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Sorvete{" + "sabor = " + super.getSabores() + "tamanho = " + tamanho + "valor" + super.getValor()+ '}';
    }

}
