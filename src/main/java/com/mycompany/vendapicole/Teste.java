/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendapicole;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kezia
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Vendedor vendedor = new Vendedor();
        Picole picole1 = new Picole();
        
        picole1.setValor(10.0);
        picole1.add("Morango");
        
        vendedor.addProduto(picole1);
        
        Picole picole2 = new Picole();
        
        picole2.setValor(10.0);
        picole2.add("Jabuticaba");
        
        vendedor.addProduto(picole2);
        
        Picole picole3 = new Picole();
        
        picole3.setValor(10.0);
        picole3.add("chocolate");
        
        vendedor.addProduto(picole3);
        
        Sorvete sorvete1 = new Sorvete();
        
        sorvete1.add("Azeitona");
        sorvete1.setValor(12.30);
        sorvete1.setTamanho("pequeno");
        
        vendedor.addProduto(sorvete1);
        
        vendedor.vender(picole3);
        
        
        System.out.println(vendedor);
  
    }
}
