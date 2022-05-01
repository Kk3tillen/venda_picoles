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

public class Picole extends Produto {

    public Picole() {
    }
    
    @Override
    public String toString() {
        return "Picole{" + "sabor = " + super.getSabores() +  "valor" + super.getValor() + '}';
    }
}
