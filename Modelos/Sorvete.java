package Modelos;

public class Sorvete {
    private double valor;
    private String sabor = "'indefinido'";
    private double tamanho;
    private String tipo = "'indefinido'";

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        String ret = "Sorvete{";
        ret += "sabor:" + this.sabor;
        ret += ", tipo:" + this.tipo;
        ret += ", tamanho:" + this.tamanho;
        ret += ", valor:" + this.valor;
        ret += "}";
        return ret;
    }
}