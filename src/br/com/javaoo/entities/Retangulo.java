package br.com.javaoo.entities;

public class Retangulo {

    private double largura;
    private double altura ;


    public void setLargura(double largura) {
        this.largura = largura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double perimetro = 2.0 * largura + 2.0 * altura;
    public double diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));;
    public double area = largura * altura;

}
