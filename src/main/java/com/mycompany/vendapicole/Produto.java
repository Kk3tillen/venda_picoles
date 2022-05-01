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
public class Produto {
    
    private double valor;
    private ArrayList<String> sabores = new ArrayList<>();
    
    public void Produto(){
       
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void add(String sabor){
        this.sabores.add(sabor);
    }
    
    public ArrayList<String> getSabores() {
        return sabores;
    }

    public void setSabores(ArrayList<String> sabores) {
        this.sabores = sabores;
    }
    
    
}
