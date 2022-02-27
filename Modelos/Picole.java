package Modelos;

public class Picole {

    private String sabor = "'indefinido'";
    private int tamanho = 0;
    private double valor = 0;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Picole{" +
                "sabor=" + sabor +
                ", tamanho=" + tamanho +
                ", valor=" + valor +
                '}';
    }
}