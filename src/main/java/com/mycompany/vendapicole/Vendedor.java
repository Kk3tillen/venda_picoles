/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.vendapicole;

import java.util.ArrayList;

/**
 * @author kezia
 */

public class Vendedor {

    private String nome;
    private ArrayList<Picole> picoles = new ArrayList<>();
    private ArrayList<Sorvete> sorvetes = new ArrayList<>();
    private double valorRecebido;

    public void Vendedor() {

    }

    public void vender(Produto produto) {
        valorRecebido += produto.getValor();
        if (produto instanceof Picole) {
            picoles.remove((Picole) produto);
        } else if (produto instanceof Sorvete) {
            sorvetes.remove((Sorvete) produto);
        }
    }

    public void addProdutos() {
        this.valorRecebido = valorRecebido;
    }

    public void addProduto(Produto produto) {
        if (produto instanceof Picole) {
            picoles.add((Picole) produto);
        } else if (produto instanceof Sorvete) {
            sorvetes.add((Sorvete) produto);
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Picole> getPicoles() {
        return picoles;
    }

    public void setPicoles(ArrayList<Picole> picoles) {
        this.picoles = picoles;
    }

    public ArrayList<Sorvete> getSorvetes() {
        return sorvetes;
    }

    public void setSorvetes(ArrayList<Sorvete> sorvetes) {
        this.sorvetes = sorvetes;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nome=" + nome + ", picoles=" + picoles + ", sorvetes=" + sorvetes + ", valorRecebido=" + valorRecebido + '}';
    }

    public void menuVendedor(Vendedor vendedor) {

    }
}